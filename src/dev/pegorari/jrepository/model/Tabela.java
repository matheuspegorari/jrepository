package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class Tabela extends AbstractSankhyaEntity<Tabela> {
   private String descTab;
   private String nomeTab;
   private BigDecimal nuCampoNumeracao;
   private String tipoNumeracao;

   public String getDescTab() {
        return descTab;
   }

   public void setDescTab(String descTab) {
        markAsChanged("DESCRTAB", descTab);
        this.descTab = descTab;
   }

   public String getNomeTab() {
        return nomeTab;
   }

   public void setNomeTab(String nomeTab) {
        markAsChanged("NOMETAB", nomeTab);
        this.nomeTab = nomeTab;
   }

   public BigDecimal getNuCampoNumeracao() {
        return nuCampoNumeracao;
   }

   public void setNuCampoNumeracao(BigDecimal nuCampoNumeracao) {
        markAsChanged("NUCAMPONUMERACAO", nuCampoNumeracao);
        this.nuCampoNumeracao = nuCampoNumeracao;
   }

   public String getTipoNumeracao() {
        return tipoNumeracao;
   }

   public void setTipoNumeracao(String tipoNumeracao) {
        markAsChanged("TIPONUMERACAO", tipoNumeracao);
        this.tipoNumeracao = tipoNumeracao;
   }

   @Override
   public String getTableName() {
        return "TDDTAB";
   }

   @Override
   public String getEntityName() {
        return "Tabela";
   }

   @Override
   public Tabela fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.descTab = vo.asString("DESCRTAB");
        this.nomeTab = vo.asString("NOMETAB");
        this.nuCampoNumeracao = vo.asBigDecimal("NUCAMPONUMERACAO");
        this.tipoNumeracao = vo.asString("TIPONUMERACAO");
        return this;
   }
}
