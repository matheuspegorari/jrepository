package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Lancamento implements SankhyaEntity<Lancamento> {

   private BigDecimal codCencus;
   private BigDecimal codConPar;
   private BigDecimal codCtaCtb;
   private BigDecimal codEmp;
   private BigDecimal codHistCtb;
   private BigDecimal codProj;
   private BigDecimal codUsu;
   private String complHist;
   private Timestamp dtMov;
   private String liberado;
   private BigDecimal numDoc;
   private BigDecimal numLanc;
   private BigDecimal numLote;
   private Timestamp referencia;
   private String tipLanc;
   private Timestamp vencimento;
   private BigDecimal vlrCred;
   private BigDecimal vlrDeb;
   private BigDecimal vlrLanc;
   private BigDecimal sequencia;
   private BigDecimal codEmpOrig;
   private Timestamp dtExtemporaneo;
   private String extemporaneo;
   private String partLalurA;
   private String chave;
   private String conciliado;

   public BigDecimal getCodCencus() {
        return codCencus;
   }

   public void setCodCencus(BigDecimal codCencus) {
        this.codCencus = codCencus;
   }

   public BigDecimal getCodConPar() {
        return codConPar;
   }

   public void setCodConPar(BigDecimal codConPar) {
        this.codConPar = codConPar;
   }

   public BigDecimal getCodCtaCtb() {
        return codCtaCtb;
   }

   public void setCodCtaCtb(BigDecimal codCtaCtb) {
        this.codCtaCtb = codCtaCtb;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public BigDecimal getCodHistCtb() {
        return codHistCtb;
   }

   public void setCodHistCtb(BigDecimal codHistCtb) {
        this.codHistCtb = codHistCtb;
   }

   public BigDecimal getCodProj() {
        return codProj;
   }

   public void setCodProj(BigDecimal codProj) {
        this.codProj = codProj;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public String getComplHist() {
        return complHist;
   }

   public void setComplHist(String complHist) {
        this.complHist = complHist;
   }

   public Timestamp getDtMov() {
        return dtMov;
   }

   public void setDtMov(Timestamp dtMov) {
        this.dtMov = dtMov;
   }

   public String getLiberado() {
        return liberado;
   }

   public void setLiberado(String liberado) {
        this.liberado = liberado;
   }

   public BigDecimal getNumDoc() {
        return numDoc;
   }

   public void setNumDoc(BigDecimal numDoc) {
        this.numDoc = numDoc;
   }

   public BigDecimal getNumLanc() {
        return numLanc;
   }

   public void setNumLanc(BigDecimal numLanc) {
        this.numLanc = numLanc;
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

   public String getTipLanc() {
        return tipLanc;
   }

   public void setTipLanc(String tipLanc) {
        this.tipLanc = tipLanc;
   }

   public Timestamp getVencimento() {
        return vencimento;
   }

   public void setVencimento(Timestamp vencimento) {
        this.vencimento = vencimento;
   }

   public BigDecimal getVlrCred() {
        return vlrCred;
   }

   public void setVlrCred(BigDecimal vlrCred) {
        this.vlrCred = vlrCred;
   }

   public BigDecimal getVlrDeb() {
        return vlrDeb;
   }

   public void setVlrDeb(BigDecimal vlrDeb) {
        this.vlrDeb = vlrDeb;
   }

   public BigDecimal getVlrLanc() {
        return vlrLanc;
   }

   public void setVlrLanc(BigDecimal vlrLanc) {
        this.vlrLanc = vlrLanc;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        this.sequencia = sequencia;
   }

   public BigDecimal getCodEmpOrig() {
        return codEmpOrig;
   }

   public void setCodEmpOrig(BigDecimal codEmpOrig) {
        this.codEmpOrig = codEmpOrig;
   }

   public Timestamp getDtExtemporaneo() {
        return dtExtemporaneo;
   }

   public void setDtExtemporaneo(Timestamp dtExtemporaneo) {
        this.dtExtemporaneo = dtExtemporaneo;
   }

   public String getExtemporaneo() {
        return extemporaneo;
   }

   public void setExtemporaneo(String extemporaneo) {
        this.extemporaneo = extemporaneo;
   }

   public String getPartLalurA() {
        return partLalurA;
   }

   public void setPartLalurA(String partLalurA) {
        this.partLalurA = partLalurA;
   }

   public String getChave() {
        return chave;
   }

   public void setChave(String chave) {
        this.chave = chave;
   }

   public String getConciliado() {
        return conciliado;
   }

   public void setConciliado(String conciliado) {
        this.conciliado = conciliado;
   }

   @Override
   public String getEntityName() {
        return "Lancamento";
   }

   @Override
   public Lancamento fromVO(DynamicVO vo) {
        this.codCencus = vo.asBigDecimal("CODCENCUS");
        this.codConPar = vo.asBigDecimal("CODCONPAR");
        this.codCtaCtb = vo.asBigDecimal("CODCTACTB");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codHistCtb = vo.asBigDecimal("CODHISTCTB");
        this.codProj = vo.asBigDecimal("CODPROJ");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.complHist = vo.asString("COMPLHIST");
        this.dtMov = vo.asTimestamp("DTMOV");
        this.liberado = vo.asString("LIBERADO");
        this.numDoc = vo.asBigDecimal("NUMDOC");
        this.numLanc = vo.asBigDecimal("NUMLANC");
        this.numLote = vo.asBigDecimal("NUMLOTE");
        this.referencia = vo.asTimestamp("REFERENCIA");
        this.tipLanc = vo.asString("TIPLANC");
        this.vencimento = vo.asTimestamp("VENCIMENTO");
        this.vlrCred = vo.asBigDecimal("VLRCRED");
        this.vlrDeb = vo.asBigDecimal("VLRDEB");
        this.vlrLanc = vo.asBigDecimal("VLRLANC");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.codEmpOrig = vo.asBigDecimal("CODEMPORIG");
        this.dtExtemporaneo = vo.asTimestamp("DTEXTEMPORANEO");
        this.extemporaneo = vo.asString("EXTEMPORANEO");
        this.partLalurA = vo.asString("PARTLALURA");
        this.chave = vo.asString("CHAVE");
        this.conciliado = vo.asString("CONCILIADO");
        return this;
   }
}
