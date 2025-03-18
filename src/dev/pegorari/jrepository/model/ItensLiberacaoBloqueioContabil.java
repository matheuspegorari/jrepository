package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ItensLiberacaoBloqueioContabil extends AbstractSankhyaEntity<ItensLiberacaoBloqueioContabil> {
   private BigDecimal nuChave;
   private BigDecimal nuLiberacao;
   private String tabela;
   private String tipo;

   public BigDecimal getNuChave() {
        return nuChave;
   }

   public void setNuChave(BigDecimal nuChave) {
        markAsChanged("NUCHAVE", nuChave);
        this.nuChave = nuChave;
   }

   public BigDecimal getNuLiberacao() {
        return nuLiberacao;
   }

   public void setNuLiberacao(BigDecimal nuLiberacao) {
        markAsChanged("NULIBERACAO", nuLiberacao);
        this.nuLiberacao = nuLiberacao;
   }

   public String getTabela() {
        return tabela;
   }

   public void setTabela(String tabela) {
        markAsChanged("TABELA", tabela);
        this.tabela = tabela;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
        this.tipo = tipo;
   }

   @Override
   public String getTableName() {
        return "TCBILB";
   }

   @Override
   public String getEntityName() {
        return "ItensLiberacaoBloqueioContabil";
   }

   @Override
   public ItensLiberacaoBloqueioContabil fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.nuChave = vo.asBigDecimal("NUCHAVE");
        this.nuLiberacao = vo.asBigDecimal("NULIBERACAO");
        this.tabela = vo.asString("TABELA");
        this.tipo = vo.asString("TIPO");
        return this;
   }
}
