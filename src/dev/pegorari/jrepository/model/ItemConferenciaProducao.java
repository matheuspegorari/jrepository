package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ItemConferenciaProducao extends AbstractSankhyaEntity<ItemConferenciaProducao> {
   private String codBarra;
   private BigDecimal codProd;
   private BigDecimal nuConf;
   private BigDecimal qtdConf;
   private String controle;

   public String getCodBarra() {
        return codBarra;
   }

   public void setCodBarra(String codBarra) {
        markAsChanged("CODBARRA", codBarra);
        this.codBarra = codBarra;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
        this.codProd = codProd;
   }

   public BigDecimal getNuConf() {
        return nuConf;
   }

   public void setNuConf(BigDecimal nuConf) {
        markAsChanged("NUCONF", nuConf);
        this.nuConf = nuConf;
   }

   public BigDecimal getQtdConf() {
        return qtdConf;
   }

   public void setQtdConf(BigDecimal qtdConf) {
        markAsChanged("QTDCONF", qtdConf);
        this.qtdConf = qtdConf;
   }

   public String getControle() {
        return controle;
   }

   public void setControle(String controle) {
        markAsChanged("CONTROLE", controle);
        this.controle = controle;
   }

   @Override
   public String getTableName() {
        return "TPRCOI";
   }

   @Override
   public String getEntityName() {
        return "ItemConferenciaProducao";
   }

   @Override
   public ItemConferenciaProducao fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.codBarra = vo.asString("CODBARRA");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.nuConf = vo.asBigDecimal("NUCONF");
        this.qtdConf = vo.asBigDecimal("QTDCONF");
        this.controle = vo.asString("CONTROLE");
        return this;
   }
}
