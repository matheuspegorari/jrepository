package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ItensPesagem extends AbstractSankhyaEntity<ItensPesagem> {
   private BigDecimal codParc;
   private BigDecimal codProc;
   private BigDecimal codProd;
   private BigDecimal numContrato;
   private BigDecimal numPesagem;
   private BigDecimal numProd;
   private BigDecimal nuNota;
   private BigDecimal nuNotaDest;
   private BigDecimal pesoNf;
   private BigDecimal pesoRomaneio;
   private BigDecimal valTotal;
   private BigDecimal valUnit;
   private String chaveNfe;
   private BigDecimal numNotaTrans;
   private String controle;

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        this.codParc = codParc;
   }

   public BigDecimal getCodProc() {
        return codProc;
   }

   public void setCodProc(BigDecimal codProc) {
        this.codProc = codProc;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        this.codProd = codProd;
   }

   public BigDecimal getNumContrato() {
        return numContrato;
   }

   public void setNumContrato(BigDecimal numContrato) {
        this.numContrato = numContrato;
   }

   public BigDecimal getNumPesagem() {
        return numPesagem;
   }

   public void setNumPesagem(BigDecimal numPesagem) {
        this.numPesagem = numPesagem;
   }

   public BigDecimal getNumProd() {
        return numProd;
   }

   public void setNumProd(BigDecimal numProd) {
        this.numProd = numProd;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        this.nuNota = nuNota;
   }

   public BigDecimal getNuNotaDest() {
        return nuNotaDest;
   }

   public void setNuNotaDest(BigDecimal nuNotaDest) {
        this.nuNotaDest = nuNotaDest;
   }

   public BigDecimal getPesoNf() {
        return pesoNf;
   }

   public void setPesoNf(BigDecimal pesoNf) {
        this.pesoNf = pesoNf;
   }

   public BigDecimal getPesoRomaneio() {
        return pesoRomaneio;
   }

   public void setPesoRomaneio(BigDecimal pesoRomaneio) {
        this.pesoRomaneio = pesoRomaneio;
   }

   public BigDecimal getValTotal() {
        return valTotal;
   }

   public void setValTotal(BigDecimal valTotal) {
        this.valTotal = valTotal;
   }

   public BigDecimal getValUnit() {
        return valUnit;
   }

   public void setValUnit(BigDecimal valUnit) {
        this.valUnit = valUnit;
   }

   public String getChaveNfe() {
        return chaveNfe;
   }

   public void setChaveNfe(String chaveNfe) {
        this.chaveNfe = chaveNfe;
   }

   public BigDecimal getNumNotaTrans() {
        return numNotaTrans;
   }

   public void setNumNotaTrans(BigDecimal numNotaTrans) {
        this.numNotaTrans = numNotaTrans;
   }

   public String getControle() {
        return controle;
   }

   public void setControle(String controle) {
        this.controle = controle;
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
        this.codParc = vo.asBigDecimal("CODPARC");
        this.codProc = vo.asBigDecimal("CODPROC");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.numContrato = vo.asBigDecimal("NUMCONTRATO");
        this.numPesagem = vo.asBigDecimal("NUMPESAGEM");
        this.numProd = vo.asBigDecimal("NUMPROD");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.nuNotaDest = vo.asBigDecimal("NUNOTADEST");
        this.pesoNf = vo.asBigDecimal("PESONF");
        this.pesoRomaneio = vo.asBigDecimal("PESOROMANEIO");
        this.valTotal = vo.asBigDecimal("VALTOTAL");
        this.valUnit = vo.asBigDecimal("VALUNIT");
        this.chaveNfe = vo.asString("CHAVENFE");
        this.numNotaTrans = vo.asBigDecimal("NUMNOTATRANS");
        this.controle = vo.asString("CONTROLE");
        return this;
   }
}
