package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class ItensLiberacaoBloqueioContabil implements SankhyaEntity<ItensLiberacaoBloqueioContabil> {

   private BigDecimal nuChave;
   private BigDecimal nuLiberacao;
   private String tabela;
   private String tipo;

   public BigDecimal getNuChave() {
        return nuChave;
   }

   public void setNuChave(BigDecimal nuChave) {
        this.nuChave = nuChave;
   }

   public BigDecimal getNuLiberacao() {
        return nuLiberacao;
   }

   public void setNuLiberacao(BigDecimal nuLiberacao) {
        this.nuLiberacao = nuLiberacao;
   }

   public String getTabela() {
        return tabela;
   }

   public void setTabela(String tabela) {
        this.tabela = tabela;
   }

   public String getTipo() {
        return tipo;
   }

   public void setTipo(String tipo) {
        this.tipo = tipo;
   }

   @Override
   public String getEntityName() {
        return "ItensLiberacaoBloqueioContabil";
   }

   @Override
   public ItensLiberacaoBloqueioContabil fromVO(DynamicVO vo) {
        this.nuChave = vo.asBigDecimal("NUCHAVE");
        this.nuLiberacao = vo.asBigDecimal("NULIBERACAO");
        this.tabela = vo.asString("TABELA");
        this.tipo = vo.asString("TIPO");
        return this;
   }
}
