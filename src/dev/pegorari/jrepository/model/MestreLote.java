package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class MestreLote implements SankhyaEntity<MestreLote> {

   private BigDecimal codUsu;
   private String comentarios;
   private BigDecimal codEmp;
   private Timestamp dtMov;
   private BigDecimal numLote;
   private Timestamp referencia;
   private String situacao;
   private BigDecimal totLote;
   private BigDecimal ultLanc;
   private BigDecimal vlrDebito;
   private BigDecimal qtdLanc;
   private BigDecimal vlrDiferenca;
   private BigDecimal vlrCredito;
   private BigDecimal codEmpConsolid;

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public String getComentarios() {
        return comentarios;
   }

   public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public Timestamp getDtMov() {
        return dtMov;
   }

   public void setDtMov(Timestamp dtMov) {
        this.dtMov = dtMov;
   }

   public BigDecimal getNumLote() {
        return numLote;
   }

   public void setNumLote(BigDecimal numLote) {
        this.numLote = numLote;
   }

   public Timestamp getReferencia() {
        return referencia;
   }

   public void setReferencia(Timestamp referencia) {
        this.referencia = referencia;
   }

   public String getSituacao() {
        return situacao;
   }

   public void setSituacao(String situacao) {
        this.situacao = situacao;
   }

   public BigDecimal getTotLote() {
        return totLote;
   }

   public void setTotLote(BigDecimal totLote) {
        this.totLote = totLote;
   }

   public BigDecimal getUltLanc() {
        return ultLanc;
   }

   public void setUltLanc(BigDecimal ultLanc) {
        this.ultLanc = ultLanc;
   }

   public BigDecimal getVlrDebito() {
        return vlrDebito;
   }

   public void setVlrDebito(BigDecimal vlrDebito) {
        this.vlrDebito = vlrDebito;
   }

   public BigDecimal getQtdLanc() {
        return qtdLanc;
   }

   public void setQtdLanc(BigDecimal qtdLanc) {
        this.qtdLanc = qtdLanc;
   }

   public BigDecimal getVlrDiferenca() {
        return vlrDiferenca;
   }

   public void setVlrDiferenca(BigDecimal vlrDiferenca) {
        this.vlrDiferenca = vlrDiferenca;
   }

   public BigDecimal getVlrCredito() {
        return vlrCredito;
   }

   public void setVlrCredito(BigDecimal vlrCredito) {
        this.vlrCredito = vlrCredito;
   }

   public BigDecimal getCodEmpConsolid() {
        return codEmpConsolid;
   }

   public void setCodEmpConsolid(BigDecimal codEmpConsolid) {
        this.codEmpConsolid = codEmpConsolid;
   }

   @Override
   public String getEntityName() {
        return "MestreLote";
   }

   @Override
   public MestreLote fromVO(DynamicVO vo) {
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.comentarios = vo.asString("COMENTARIOS");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.dtMov = vo.asTimestamp("DTMOV");
        this.numLote = vo.asBigDecimal("NUMLOTE");
        this.referencia = vo.asTimestamp("REFERENCIA");
        this.situacao = vo.asString("SITUACAO");
        this.totLote = vo.asBigDecimal("TOTLOTE");
        this.ultLanc = vo.asBigDecimal("ULTLANC");
        this.vlrDebito = vo.asBigDecimal("VLRDEBITO");
        this.qtdLanc = vo.asBigDecimal("QTDLANC");
        this.vlrDiferenca = vo.asBigDecimal("VLRDIFERENCA");
        this.vlrCredito = vo.asBigDecimal("VLRCREDITO");
        this.codEmpConsolid = vo.asBigDecimal("CODEMPCONSOLID");
        return this;
   }
}
