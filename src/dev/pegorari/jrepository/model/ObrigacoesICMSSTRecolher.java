package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ObrigacoesICMSSTRecolher extends AbstractSankhyaEntity<ObrigacoesICMSSTRecolher> {
   private BigDecimal codEmp;
   private BigDecimal codObr;
   private String codRec;
   private BigDecimal codUf;
   private BigDecimal codUsu;
   private String descrCompl;
   private String descrProcesso;
   private Timestamp dtAlter;
   private Timestamp dtRef;
   private Timestamp dtVcto;
   private String numProcesso;
   private BigDecimal origProcesso;
   private BigDecimal sequencia;
   private String tipApuracao;
   private BigDecimal valor;
   private String indSubApuracao;
   private BigDecimal codClsVencDime;
   private String codRecDime;

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public BigDecimal getCodObr() {
        return codObr;
   }

   public void setCodObr(BigDecimal codObr) {
        this.codObr = codObr;
   }

   public String getCodRec() {
        return codRec;
   }

   public void setCodRec(String codRec) {
        this.codRec = codRec;
   }

   public BigDecimal getCodUf() {
        return codUf;
   }

   public void setCodUf(BigDecimal codUf) {
        this.codUf = codUf;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public String getDescrCompl() {
        return descrCompl;
   }

   public void setDescrCompl(String descrCompl) {
        this.descrCompl = descrCompl;
   }

   public String getDescrProcesso() {
        return descrProcesso;
   }

   public void setDescrProcesso(String descrProcesso) {
        this.descrProcesso = descrProcesso;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        this.dtAlter = dtAlter;
   }

   public Timestamp getDtRef() {
        return dtRef;
   }

   public void setDtRef(Timestamp dtRef) {
        this.dtRef = dtRef;
   }

   public Timestamp getDtVcto() {
        return dtVcto;
   }

   public void setDtVcto(Timestamp dtVcto) {
        this.dtVcto = dtVcto;
   }

   public String getNumProcesso() {
        return numProcesso;
   }

   public void setNumProcesso(String numProcesso) {
        this.numProcesso = numProcesso;
   }

   public BigDecimal getOrigProcesso() {
        return origProcesso;
   }

   public void setOrigProcesso(BigDecimal origProcesso) {
        this.origProcesso = origProcesso;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        this.sequencia = sequencia;
   }

   public String getTipApuracao() {
        return tipApuracao;
   }

   public void setTipApuracao(String tipApuracao) {
        this.tipApuracao = tipApuracao;
   }

   public BigDecimal getValor() {
        return valor;
   }

   public void setValor(BigDecimal valor) {
        this.valor = valor;
   }

   public String getIndSubApuracao() {
        return indSubApuracao;
   }

   public void setIndSubApuracao(String indSubApuracao) {
        this.indSubApuracao = indSubApuracao;
   }

   public BigDecimal getCodClsVencDime() {
        return codClsVencDime;
   }

   public void setCodClsVencDime(BigDecimal codClsVencDime) {
        this.codClsVencDime = codClsVencDime;
   }

   public String getCodRecDime() {
        return codRecDime;
   }

   public void setCodRecDime(String codRecDime) {
        this.codRecDime = codRecDime;
   }

   @Override
   public String getTableName() {
        return "TGFOIR";
   }

   @Override
   public String getEntityName() {
        return "ObrigacoesICMSSTRecolher";
   }

   @Override
   public ObrigacoesICMSSTRecolher fromVO(DynamicVO vo) {
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codObr = vo.asBigDecimal("CODOBR");
        this.codRec = vo.asString("CODREC");
        this.codUf = vo.asBigDecimal("CODUF");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.descrCompl = vo.asString("DESCRCOMPL");
        this.descrProcesso = vo.asString("DESCRPROCESSO");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.dtRef = vo.asTimestamp("DTREF");
        this.dtVcto = vo.asTimestamp("DTVCTO");
        this.numProcesso = vo.asString("NUMPROCESSO");
        this.origProcesso = vo.asBigDecimal("ORIGPROCESSO");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.tipApuracao = vo.asString("TIPAPURACAO");
        this.valor = vo.asBigDecimal("VALOR");
        this.indSubApuracao = vo.asString("INDSUBAPURACAO");
        this.codClsVencDime = vo.asBigDecimal("CODCLSVENCDIME");
        this.codRecDime = vo.asString("CODRECDIME");
        return this;
   }
}
