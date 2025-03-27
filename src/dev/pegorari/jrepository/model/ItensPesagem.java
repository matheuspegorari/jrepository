package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ItensPesagem extends AbstractSankhyaEntity<ItensPesagem> {
   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public BigDecimal getCodProc() {
        return this.getVo().asBigDecimal("CODPROC");
   }

   public void setCodProc(BigDecimal codProc) {
        markAsChanged("CODPROC", codProc);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public BigDecimal getNumContrato() {
        return this.getVo().asBigDecimal("NUMCONTRATO");
   }

   public void setNumContrato(BigDecimal numContrato) {
        markAsChanged("NUMCONTRATO", numContrato);
   }

   public BigDecimal getNumPesagem() {
        return this.getVo().asBigDecimal("NUMPESAGEM");
   }

   public void setNumPesagem(BigDecimal numPesagem) {
        markAsChanged("NUMPESAGEM", numPesagem);
   }

   public BigDecimal getNumProd() {
        return this.getVo().asBigDecimal("NUMPROD");
   }

   public void setNumProd(BigDecimal numProd) {
        markAsChanged("NUMPROD", numProd);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public BigDecimal getNuNotaDest() {
        return this.getVo().asBigDecimal("NUNOTADEST");
   }

   public void setNuNotaDest(BigDecimal nuNotaDest) {
        markAsChanged("NUNOTADEST", nuNotaDest);
   }

   public BigDecimal getPesoNf() {
        return this.getVo().asBigDecimal("PESONF");
   }

   public void setPesoNf(BigDecimal pesoNf) {
        markAsChanged("PESONF", pesoNf);
   }

   public BigDecimal getPesoRomaneio() {
        return this.getVo().asBigDecimal("PESOROMANEIO");
   }

   public void setPesoRomaneio(BigDecimal pesoRomaneio) {
        markAsChanged("PESOROMANEIO", pesoRomaneio);
   }

   public BigDecimal getValTotal() {
        return this.getVo().asBigDecimal("VALTOTAL");
   }

   public void setValTotal(BigDecimal valTotal) {
        markAsChanged("VALTOTAL", valTotal);
   }

   public BigDecimal getValUnit() {
        return this.getVo().asBigDecimal("VALUNIT");
   }

   public void setValUnit(BigDecimal valUnit) {
        markAsChanged("VALUNIT", valUnit);
   }

   public String getChaveNfe() {
        return this.getVo().asString("CHAVENFE");
   }

   public void setChaveNfe(String chaveNfe) {
        markAsChanged("CHAVENFE", chaveNfe);
   }

   public BigDecimal getNumNotaTrans() {
        return this.getVo().asBigDecimal("NUMNOTATRANS");
   }

   public void setNumNotaTrans(BigDecimal numNotaTrans) {
        markAsChanged("NUMNOTATRANS", numNotaTrans);
   }

   public String getControle() {
        return this.getVo().asString("CONTROLE");
   }

   public void setControle(String controle) {
        markAsChanged("CONTROLE", controle);
   }

   @Override
   public String getTableName() {
        return "TGAPESI";
   }

   @Override
   public String getEntityName() {
        return "ItensPesagem";
   }

   @Override
   public ItensPesagem fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
