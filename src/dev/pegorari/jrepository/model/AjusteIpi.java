package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class AjusteIpi extends AbstractSankhyaEntity<AjusteIpi> {
   private String chaveNfe;
   private BigDecimal codAjuste;
   private BigDecimal codEmp;
   private BigDecimal codModDoc;
   private BigDecimal codParc;
   private BigDecimal codUsu;
   private String digitado;
   private Timestamp dtAlter;
   private Timestamp dtDoc;
   private BigDecimal numNota;
   private BigDecimal nuNota;
   private String observacao;
   private BigDecimal origProcesso;
   private String serieNota;
   private String tipImposto;
   private BigDecimal vlrAjuste;

   public String getChaveNfe() {
        return chaveNfe;
   }

   public void setChaveNfe(String chaveNfe) {
        this.chaveNfe = chaveNfe;
   }

   public BigDecimal getCodAjuste() {
        return codAjuste;
   }

   public void setCodAjuste(BigDecimal codAjuste) {
        this.codAjuste = codAjuste;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public BigDecimal getCodModDoc() {
        return codModDoc;
   }

   public void setCodModDoc(BigDecimal codModDoc) {
        this.codModDoc = codModDoc;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        this.codParc = codParc;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public String getDigitado() {
        return digitado;
   }

   public void setDigitado(String digitado) {
        this.digitado = digitado;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        this.dtAlter = dtAlter;
   }

   public Timestamp getDtDoc() {
        return dtDoc;
   }

   public void setDtDoc(Timestamp dtDoc) {
        this.dtDoc = dtDoc;
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

   public String getObservacao() {
        return observacao;
   }

   public void setObservacao(String observacao) {
        this.observacao = observacao;
   }

   public BigDecimal getOrigProcesso() {
        return origProcesso;
   }

   public void setOrigProcesso(BigDecimal origProcesso) {
        this.origProcesso = origProcesso;
   }

   public String getSerieNota() {
        return serieNota;
   }

   public void setSerieNota(String serieNota) {
        this.serieNota = serieNota;
   }

   public String getTipImposto() {
        return tipImposto;
   }

   public void setTipImposto(String tipImposto) {
        this.tipImposto = tipImposto;
   }

   public BigDecimal getVlrAjuste() {
        return vlrAjuste;
   }

   public void setVlrAjuste(BigDecimal vlrAjuste) {
        this.vlrAjuste = vlrAjuste;
   }

   @Override
   public String getTableName() {
        return "TGFAJI";
   }

   @Override
   public String getEntityName() {
        return "AjusteIpi";
   }

   @Override
   public AjusteIpi fromVO(DynamicVO vo) {
        this.chaveNfe = vo.asString("CHAVENFE");
        this.codAjuste = vo.asBigDecimal("CODAJUSTE");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codModDoc = vo.asBigDecimal("CODMODDOC");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.digitado = vo.asString("DIGITADO");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.dtDoc = vo.asTimestamp("DTDOC");
        this.numNota = vo.asBigDecimal("NUMNOTA");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.observacao = vo.asString("OBSERVACAO");
        this.origProcesso = vo.asBigDecimal("ORIGPROCESSO");
        this.serieNota = vo.asString("SERIENOTA");
        this.tipImposto = vo.asString("TIPIMPOSTO");
        this.vlrAjuste = vo.asBigDecimal("VLRAJUSTE");
        return this;
   }
}
