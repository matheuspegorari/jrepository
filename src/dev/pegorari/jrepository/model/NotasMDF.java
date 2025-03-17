package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class NotasMDF extends AbstractSankhyaEntity<NotasMDF> {
   private BigDecimal codParc;
   private BigDecimal numNota;
   private BigDecimal nuNota;
   private BigDecimal nuViag;
   private BigDecimal ordemCarga;
   private BigDecimal pesoBruto;
   private String razaoSocial;
   private String razaoSocialParc;
   private BigDecimal seqMdfe;
   private BigDecimal vlrNota;
   private BigDecimal codEmp;
   private String indReentrega;
   private String statusEnvio;

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        this.codParc = codParc;
   }

   public BigDecimal getNumNota() {
        return numNota;
   }

   public void setNumNota(BigDecimal numNota) {
        this.numNota = numNota;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        this.nuNota = nuNota;
   }

   public BigDecimal getNuViag() {
        return nuViag;
   }

   public void setNuViag(BigDecimal nuViag) {
        this.nuViag = nuViag;
   }

   public BigDecimal getOrdemCarga() {
        return ordemCarga;
   }

   public void setOrdemCarga(BigDecimal ordemCarga) {
        this.ordemCarga = ordemCarga;
   }

   public BigDecimal getPesoBruto() {
        return pesoBruto;
   }

   public void setPesoBruto(BigDecimal pesoBruto) {
        this.pesoBruto = pesoBruto;
   }

   public String getRazaoSocial() {
        return razaoSocial;
   }

   public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
   }

   public String getRazaoSocialParc() {
        return razaoSocialParc;
   }

   public void setRazaoSocialParc(String razaoSocialParc) {
        this.razaoSocialParc = razaoSocialParc;
   }

   public BigDecimal getSeqMdfe() {
        return seqMdfe;
   }

   public void setSeqMdfe(BigDecimal seqMdfe) {
        this.seqMdfe = seqMdfe;
   }

   public BigDecimal getVlrNota() {
        return vlrNota;
   }

   public void setVlrNota(BigDecimal vlrNota) {
        this.vlrNota = vlrNota;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public String getIndReentrega() {
        return indReentrega;
   }

   public void setIndReentrega(String indReentrega) {
        this.indReentrega = indReentrega;
   }

   public String getStatusEnvio() {
        return statusEnvio;
   }

   public void setStatusEnvio(String statusEnvio) {
        this.statusEnvio = statusEnvio;
   }

   @Override
   public String getTableName() {
        return "TGFNMDFE";
   }

   @Override
   public String getEntityName() {
        return "NotasMDF";
   }

   @Override
   public NotasMDF fromVO(DynamicVO vo) {
        this.codParc = vo.asBigDecimal("CODPARC");
        this.numNota = vo.asBigDecimal("NUMNOTA");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.nuViag = vo.asBigDecimal("NUVIAG");
        this.ordemCarga = vo.asBigDecimal("ORDEMCARGA");
        this.pesoBruto = vo.asBigDecimal("PESOBRUTO");
        this.razaoSocial = vo.asString("RAZAOSOCIAL");
        this.razaoSocialParc = vo.asString("RAZAOSOCIALPARC");
        this.seqMdfe = vo.asBigDecimal("SEQMDFE");
        this.vlrNota = vo.asBigDecimal("VLRNOTA");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.indReentrega = vo.asString("INDREENTREGA");
        this.statusEnvio = vo.asString("STATUSENVIO");
        return this;
   }
}
