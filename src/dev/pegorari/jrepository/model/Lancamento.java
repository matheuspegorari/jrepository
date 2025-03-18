package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Lancamento extends AbstractSankhyaEntity<Lancamento> {
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
        markAsChanged("CODCENCUS", codCencus);
        this.codCencus = codCencus;
   }

   public BigDecimal getCodConPar() {
        return codConPar;
   }

   public void setCodConPar(BigDecimal codConPar) {
        markAsChanged("CODCONPAR", codConPar);
        this.codConPar = codConPar;
   }

   public BigDecimal getCodCtaCtb() {
        return codCtaCtb;
   }

   public void setCodCtaCtb(BigDecimal codCtaCtb) {
        markAsChanged("CODCTACTB", codCtaCtb);
        this.codCtaCtb = codCtaCtb;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public BigDecimal getCodHistCtb() {
        return codHistCtb;
   }

   public void setCodHistCtb(BigDecimal codHistCtb) {
        markAsChanged("CODHISTCTB", codHistCtb);
        this.codHistCtb = codHistCtb;
   }

   public BigDecimal getCodProj() {
        return codProj;
   }

   public void setCodProj(BigDecimal codProj) {
        markAsChanged("CODPROJ", codProj);
        this.codProj = codProj;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public String getComplHist() {
        return complHist;
   }

   public void setComplHist(String complHist) {
        markAsChanged("COMPLHIST", complHist);
        this.complHist = complHist;
   }

   public Timestamp getDtMov() {
        return dtMov;
   }

   public void setDtMov(Timestamp dtMov) {
        markAsChanged("DTMOV", dtMov);
        this.dtMov = dtMov;
   }

   public String getLiberado() {
        return liberado;
   }

   public void setLiberado(String liberado) {
        markAsChanged("LIBERADO", liberado);
        this.liberado = liberado;
   }

   public BigDecimal getNumDoc() {
        return numDoc;
   }

   public void setNumDoc(BigDecimal numDoc) {
        markAsChanged("NUMDOC", numDoc);
        this.numDoc = numDoc;
   }

   public BigDecimal getNumLanc() {
        return numLanc;
   }

   public void setNumLanc(BigDecimal numLanc) {
        markAsChanged("NUMLANC", numLanc);
        this.numLanc = numLanc;
   }

   public BigDecimal getNumLote() {
        return numLote;
   }

   public void setNumLote(BigDecimal numLote) {
        markAsChanged("NUMLOTE", numLote);
        this.numLote = numLote;
   }

   public Timestamp getReferencia() {
        return referencia;
   }

   public void setReferencia(Timestamp referencia) {
        markAsChanged("REFERENCIA", referencia);
        this.referencia = referencia;
   }

   public String getTipLanc() {
        return tipLanc;
   }

   public void setTipLanc(String tipLanc) {
        markAsChanged("TIPLANC", tipLanc);
        this.tipLanc = tipLanc;
   }

   public Timestamp getVencimento() {
        return vencimento;
   }

   public void setVencimento(Timestamp vencimento) {
        markAsChanged("VENCIMENTO", vencimento);
        this.vencimento = vencimento;
   }

   public BigDecimal getVlrCred() {
        return vlrCred;
   }

   public void setVlrCred(BigDecimal vlrCred) {
        markAsChanged("VLRCRED", vlrCred);
        this.vlrCred = vlrCred;
   }

   public BigDecimal getVlrDeb() {
        return vlrDeb;
   }

   public void setVlrDeb(BigDecimal vlrDeb) {
        markAsChanged("VLRDEB", vlrDeb);
        this.vlrDeb = vlrDeb;
   }

   public BigDecimal getVlrLanc() {
        return vlrLanc;
   }

   public void setVlrLanc(BigDecimal vlrLanc) {
        markAsChanged("VLRLANC", vlrLanc);
        this.vlrLanc = vlrLanc;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
        this.sequencia = sequencia;
   }

   public BigDecimal getCodEmpOrig() {
        return codEmpOrig;
   }

   public void setCodEmpOrig(BigDecimal codEmpOrig) {
        markAsChanged("CODEMPORIG", codEmpOrig);
        this.codEmpOrig = codEmpOrig;
   }

   public Timestamp getDtExtemporaneo() {
        return dtExtemporaneo;
   }

   public void setDtExtemporaneo(Timestamp dtExtemporaneo) {
        markAsChanged("DTEXTEMPORANEO", dtExtemporaneo);
        this.dtExtemporaneo = dtExtemporaneo;
   }

   public String getExtemporaneo() {
        return extemporaneo;
   }

   public void setExtemporaneo(String extemporaneo) {
        markAsChanged("EXTEMPORANEO", extemporaneo);
        this.extemporaneo = extemporaneo;
   }

   public String getPartLalurA() {
        return partLalurA;
   }

   public void setPartLalurA(String partLalurA) {
        markAsChanged("PARTLALUR_A", partLalurA);
        this.partLalurA = partLalurA;
   }

   public String getChave() {
        return chave;
   }

   public void setChave(String chave) {
        markAsChanged("CHAVE", chave);
        this.chave = chave;
   }

   public String getConciliado() {
        return conciliado;
   }

   public void setConciliado(String conciliado) {
        markAsChanged("CONCILIADO", conciliado);
        this.conciliado = conciliado;
   }

   @Override
   public String getTableName() {
        return "TCBLAN";
   }

   @Override
   public String getEntityName() {
        return "Lancamento";
   }

   @Override
   public Lancamento fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
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
        this.partLalurA = vo.asString("PARTLALUR_A");
        this.chave = vo.asString("CHAVE");
        this.conciliado = vo.asString("CONCILIADO");
        return this;
   }
}
