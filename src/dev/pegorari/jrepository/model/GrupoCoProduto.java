package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class GrupoCoProduto extends AbstractSankhyaEntity<GrupoCoProduto> {
   private String ativo;
   private BigDecimal codProdMp;
   private String codVol;
   private String controleMp;
   private String descrCop;
   private BigDecimal idCop;
   private BigDecimal qtdProcess;

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
        this.ativo = ativo;
   }

   public BigDecimal getCodProdMp() {
        return codProdMp;
   }

   public void setCodProdMp(BigDecimal codProdMp) {
        markAsChanged("CODPRODMP", codProdMp);
        this.codProdMp = codProdMp;
   }

   public String getCodVol() {
        return codVol;
   }

   public void setCodVol(String codVol) {
        markAsChanged("CODVOL", codVol);
        this.codVol = codVol;
   }

   public String getControleMp() {
        return controleMp;
   }

   public void setControleMp(String controleMp) {
        markAsChanged("CONTROLEMP", controleMp);
        this.controleMp = controleMp;
   }

   public String getDescrCop() {
        return descrCop;
   }

   public void setDescrCop(String descrCop) {
        markAsChanged("DESCRCOP", descrCop);
        this.descrCop = descrCop;
   }

   public BigDecimal getIdCop() {
        return idCop;
   }

   public void setIdCop(BigDecimal idCop) {
        markAsChanged("IDCOP", idCop);
        this.idCop = idCop;
   }

   public BigDecimal getQtdProcess() {
        return qtdProcess;
   }

   public void setQtdProcess(BigDecimal qtdProcess) {
        markAsChanged("QTDPROCESS", qtdProcess);
        this.qtdProcess = qtdProcess;
   }

   @Override
   public String getTableName() {
        return "TPRCOP";
   }

   @Override
   public String getEntityName() {
        return "GrupoCoProduto";
   }

   @Override
   public GrupoCoProduto fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.ativo = vo.asString("ATIVO");
        this.codProdMp = vo.asBigDecimal("CODPRODMP");
        this.codVol = vo.asString("CODVOL");
        this.controleMp = vo.asString("CONTROLEMP");
        this.descrCop = vo.asString("DESCRCOP");
        this.idCop = vo.asBigDecimal("IDCOP");
        this.qtdProcess = vo.asBigDecimal("QTDPROCESS");
        return this;
   }
}
