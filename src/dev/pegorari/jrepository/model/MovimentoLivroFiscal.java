package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class MovimentoLivroFiscal extends AbstractSankhyaEntity<MovimentoLivroFiscal> {
   private BigDecimal codModDoc;
   private String empParc;
   private String entSai;
   private String espDoc;
   private BigDecimal gtoTecf;
   private BigDecimal icmsRetencao;
   private BigDecimal isentasIcms;
   private BigDecimal isentasIpi;
   private BigDecimal numLanc;
   private BigDecimal numNota;
   private BigDecimal numNota2;
   private BigDecimal nuNota;
   private String observacao;
   private String origem;
   private BigDecimal outrasIcms;
   private BigDecimal outrasIpi;
   private BigDecimal sequencia;
   private String serieNota;
   private String tipIcms;
   private String tipIpi;
   private String ufDestino;
   private String ufOrigem;
   private BigDecimal vlrCtb;
   private BigDecimal vlrCtbTare;
   private BigDecimal vlrIcms;
   private BigDecimal vlrIcmsTare;
   private BigDecimal vlrIpi;
   private BigDecimal vlrTare;
   private BigDecimal codParc;
   private BigDecimal codTrib;
   private Timestamp dhMov;
   private BigDecimal difIcms;
   private String digitado;
   private Timestamp dtDoc;
   private String chaveCte;
   private String chaveCteRef;
   private String chaveNfe;
   private String codAntecipSt;
   private BigDecimal codCfo;
   private BigDecimal codCtaCtb;
   private BigDecimal codEmp;
   private BigDecimal aliqIcms;
   private BigDecimal aliqIpi;
   private BigDecimal baseIcms;
   private BigDecimal baseIcmsTare;
   private BigDecimal baseIpi;
   private BigDecimal baseRetencao;
   private BigDecimal codEmpOrig;
   private BigDecimal baseRetencaoSemRed;
   private Timestamp dtFilt;
   private Timestamp dtEntSaiInfo;
   private BigDecimal vlrIcmsCompl;
   private String ufEntrega;
   private BigDecimal codContatoEntrega;
   private BigDecimal codCidFimCte;
   private BigDecimal codCidIniCte;
   private BigDecimal vlrIcmsDifalRem;
   private BigDecimal vlrIcmsFcp;
   private BigDecimal vlrStFcpInt;
   private BigDecimal vlrIcmsFcpInt;
   private BigDecimal codProd;
   private BigDecimal vlrIcmsDifalDest;
   private BigDecimal codTipOper;
   private String descrEmpParc;
   private Timestamp dtCanc;
   private BigDecimal codUsu;
   private Timestamp dhAlter;
   private String tipMov;

   public BigDecimal getCodModDoc() {
        return codModDoc;
   }

   public void setCodModDoc(BigDecimal codModDoc) {
        this.codModDoc = codModDoc;
   }

   public String getEmpParc() {
        return empParc;
   }

   public void setEmpParc(String empParc) {
        this.empParc = empParc;
   }

   public String getEntSai() {
        return entSai;
   }

   public void setEntSai(String entSai) {
        this.entSai = entSai;
   }

   public String getEspDoc() {
        return espDoc;
   }

   public void setEspDoc(String espDoc) {
        this.espDoc = espDoc;
   }

   public BigDecimal getGtoTecf() {
        return gtoTecf;
   }

   public void setGtoTecf(BigDecimal gtoTecf) {
        this.gtoTecf = gtoTecf;
   }

   public BigDecimal getIcmsRetencao() {
        return icmsRetencao;
   }

   public void setIcmsRetencao(BigDecimal icmsRetencao) {
        this.icmsRetencao = icmsRetencao;
   }

   public BigDecimal getIsentasIcms() {
        return isentasIcms;
   }

   public void setIsentasIcms(BigDecimal isentasIcms) {
        this.isentasIcms = isentasIcms;
   }

   public BigDecimal getIsentasIpi() {
        return isentasIpi;
   }

   public void setIsentasIpi(BigDecimal isentasIpi) {
        this.isentasIpi = isentasIpi;
   }

   public BigDecimal getNumLanc() {
        return numLanc;
   }

   public void setNumLanc(BigDecimal numLanc) {
        this.numLanc = numLanc;
   }

   public BigDecimal getNumNota() {
        return numNota;
   }

   public void setNumNota(BigDecimal numNota) {
        this.numNota = numNota;
   }

   public BigDecimal getNumNota2() {
        return numNota2;
   }

   public void setNumNota2(BigDecimal numNota2) {
        this.numNota2 = numNota2;
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

   public String getOrigem() {
        return origem;
   }

   public void setOrigem(String origem) {
        this.origem = origem;
   }

   public BigDecimal getOutrasIcms() {
        return outrasIcms;
   }

   public void setOutrasIcms(BigDecimal outrasIcms) {
        this.outrasIcms = outrasIcms;
   }

   public BigDecimal getOutrasIpi() {
        return outrasIpi;
   }

   public void setOutrasIpi(BigDecimal outrasIpi) {
        this.outrasIpi = outrasIpi;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        this.sequencia = sequencia;
   }

   public String getSerieNota() {
        return serieNota;
   }

   public void setSerieNota(String serieNota) {
        this.serieNota = serieNota;
   }

   public String getTipIcms() {
        return tipIcms;
   }

   public void setTipIcms(String tipIcms) {
        this.tipIcms = tipIcms;
   }

   public String getTipIpi() {
        return tipIpi;
   }

   public void setTipIpi(String tipIpi) {
        this.tipIpi = tipIpi;
   }

   public String getUfDestino() {
        return ufDestino;
   }

   public void setUfDestino(String ufDestino) {
        this.ufDestino = ufDestino;
   }

   public String getUfOrigem() {
        return ufOrigem;
   }

   public void setUfOrigem(String ufOrigem) {
        this.ufOrigem = ufOrigem;
   }

   public BigDecimal getVlrCtb() {
        return vlrCtb;
   }

   public void setVlrCtb(BigDecimal vlrCtb) {
        this.vlrCtb = vlrCtb;
   }

   public BigDecimal getVlrCtbTare() {
        return vlrCtbTare;
   }

   public void setVlrCtbTare(BigDecimal vlrCtbTare) {
        this.vlrCtbTare = vlrCtbTare;
   }

   public BigDecimal getVlrIcms() {
        return vlrIcms;
   }

   public void setVlrIcms(BigDecimal vlrIcms) {
        this.vlrIcms = vlrIcms;
   }

   public BigDecimal getVlrIcmsTare() {
        return vlrIcmsTare;
   }

   public void setVlrIcmsTare(BigDecimal vlrIcmsTare) {
        this.vlrIcmsTare = vlrIcmsTare;
   }

   public BigDecimal getVlrIpi() {
        return vlrIpi;
   }

   public void setVlrIpi(BigDecimal vlrIpi) {
        this.vlrIpi = vlrIpi;
   }

   public BigDecimal getVlrTare() {
        return vlrTare;
   }

   public void setVlrTare(BigDecimal vlrTare) {
        this.vlrTare = vlrTare;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        this.codParc = codParc;
   }

   public BigDecimal getCodTrib() {
        return codTrib;
   }

   public void setCodTrib(BigDecimal codTrib) {
        this.codTrib = codTrib;
   }

   public Timestamp getDhMov() {
        return dhMov;
   }

   public void setDhMov(Timestamp dhMov) {
        this.dhMov = dhMov;
   }

   public BigDecimal getDifIcms() {
        return difIcms;
   }

   public void setDifIcms(BigDecimal difIcms) {
        this.difIcms = difIcms;
   }

   public String getDigitado() {
        return digitado;
   }

   public void setDigitado(String digitado) {
        this.digitado = digitado;
   }

   public Timestamp getDtDoc() {
        return dtDoc;
   }

   public void setDtDoc(Timestamp dtDoc) {
        this.dtDoc = dtDoc;
   }

   public String getChaveCte() {
        return chaveCte;
   }

   public void setChaveCte(String chaveCte) {
        this.chaveCte = chaveCte;
   }

   public String getChaveCteRef() {
        return chaveCteRef;
   }

   public void setChaveCteRef(String chaveCteRef) {
        this.chaveCteRef = chaveCteRef;
   }

   public String getChaveNfe() {
        return chaveNfe;
   }

   public void setChaveNfe(String chaveNfe) {
        this.chaveNfe = chaveNfe;
   }

   public String getCodAntecipSt() {
        return codAntecipSt;
   }

   public void setCodAntecipSt(String codAntecipSt) {
        this.codAntecipSt = codAntecipSt;
   }

   public BigDecimal getCodCfo() {
        return codCfo;
   }

   public void setCodCfo(BigDecimal codCfo) {
        this.codCfo = codCfo;
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

   public BigDecimal getAliqIcms() {
        return aliqIcms;
   }

   public void setAliqIcms(BigDecimal aliqIcms) {
        this.aliqIcms = aliqIcms;
   }

   public BigDecimal getAliqIpi() {
        return aliqIpi;
   }

   public void setAliqIpi(BigDecimal aliqIpi) {
        this.aliqIpi = aliqIpi;
   }

   public BigDecimal getBaseIcms() {
        return baseIcms;
   }

   public void setBaseIcms(BigDecimal baseIcms) {
        this.baseIcms = baseIcms;
   }

   public BigDecimal getBaseIcmsTare() {
        return baseIcmsTare;
   }

   public void setBaseIcmsTare(BigDecimal baseIcmsTare) {
        this.baseIcmsTare = baseIcmsTare;
   }

   public BigDecimal getBaseIpi() {
        return baseIpi;
   }

   public void setBaseIpi(BigDecimal baseIpi) {
        this.baseIpi = baseIpi;
   }

   public BigDecimal getBaseRetencao() {
        return baseRetencao;
   }

   public void setBaseRetencao(BigDecimal baseRetencao) {
        this.baseRetencao = baseRetencao;
   }

   public BigDecimal getCodEmpOrig() {
        return codEmpOrig;
   }

   public void setCodEmpOrig(BigDecimal codEmpOrig) {
        this.codEmpOrig = codEmpOrig;
   }

   public BigDecimal getBaseRetencaoSemRed() {
        return baseRetencaoSemRed;
   }

   public void setBaseRetencaoSemRed(BigDecimal baseRetencaoSemRed) {
        this.baseRetencaoSemRed = baseRetencaoSemRed;
   }

   public Timestamp getDtFilt() {
        return dtFilt;
   }

   public void setDtFilt(Timestamp dtFilt) {
        this.dtFilt = dtFilt;
   }

   public Timestamp getDtEntSaiInfo() {
        return dtEntSaiInfo;
   }

   public void setDtEntSaiInfo(Timestamp dtEntSaiInfo) {
        this.dtEntSaiInfo = dtEntSaiInfo;
   }

   public BigDecimal getVlrIcmsCompl() {
        return vlrIcmsCompl;
   }

   public void setVlrIcmsCompl(BigDecimal vlrIcmsCompl) {
        this.vlrIcmsCompl = vlrIcmsCompl;
   }

   public String getUfEntrega() {
        return ufEntrega;
   }

   public void setUfEntrega(String ufEntrega) {
        this.ufEntrega = ufEntrega;
   }

   public BigDecimal getCodContatoEntrega() {
        return codContatoEntrega;
   }

   public void setCodContatoEntrega(BigDecimal codContatoEntrega) {
        this.codContatoEntrega = codContatoEntrega;
   }

   public BigDecimal getCodCidFimCte() {
        return codCidFimCte;
   }

   public void setCodCidFimCte(BigDecimal codCidFimCte) {
        this.codCidFimCte = codCidFimCte;
   }

   public BigDecimal getCodCidIniCte() {
        return codCidIniCte;
   }

   public void setCodCidIniCte(BigDecimal codCidIniCte) {
        this.codCidIniCte = codCidIniCte;
   }

   public BigDecimal getVlrIcmsDifalRem() {
        return vlrIcmsDifalRem;
   }

   public void setVlrIcmsDifalRem(BigDecimal vlrIcmsDifalRem) {
        this.vlrIcmsDifalRem = vlrIcmsDifalRem;
   }

   public BigDecimal getVlrIcmsFcp() {
        return vlrIcmsFcp;
   }

   public void setVlrIcmsFcp(BigDecimal vlrIcmsFcp) {
        this.vlrIcmsFcp = vlrIcmsFcp;
   }

   public BigDecimal getVlrStFcpInt() {
        return vlrStFcpInt;
   }

   public void setVlrStFcpInt(BigDecimal vlrStFcpInt) {
        this.vlrStFcpInt = vlrStFcpInt;
   }

   public BigDecimal getVlrIcmsFcpInt() {
        return vlrIcmsFcpInt;
   }

   public void setVlrIcmsFcpInt(BigDecimal vlrIcmsFcpInt) {
        this.vlrIcmsFcpInt = vlrIcmsFcpInt;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        this.codProd = codProd;
   }

   public BigDecimal getVlrIcmsDifalDest() {
        return vlrIcmsDifalDest;
   }

   public void setVlrIcmsDifalDest(BigDecimal vlrIcmsDifalDest) {
        this.vlrIcmsDifalDest = vlrIcmsDifalDest;
   }

   public BigDecimal getCodTipOper() {
        return codTipOper;
   }

   public void setCodTipOper(BigDecimal codTipOper) {
        this.codTipOper = codTipOper;
   }

   public String getDescrEmpParc() {
        return descrEmpParc;
   }

   public void setDescrEmpParc(String descrEmpParc) {
        this.descrEmpParc = descrEmpParc;
   }

   public Timestamp getDtCanc() {
        return dtCanc;
   }

   public void setDtCanc(Timestamp dtCanc) {
        this.dtCanc = dtCanc;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        this.dhAlter = dhAlter;
   }

   public String getTipMov() {
        return tipMov;
   }

   public void setTipMov(String tipMov) {
        this.tipMov = tipMov;
   }

   @Override
   public String getTableName() {
        return "TGFLIV";
   }

   @Override
   public String getEntityName() {
        return "MovimentoLivroFiscal";
   }

   @Override
   public MovimentoLivroFiscal fromVO(DynamicVO vo) {
        this.codModDoc = vo.asBigDecimal("CODMODDOC");
        this.empParc = vo.asString("EMPPARC");
        this.entSai = vo.asString("ENTSAI");
        this.espDoc = vo.asString("ESPDOC");
        this.gtoTecf = vo.asBigDecimal("GTOTECF");
        this.icmsRetencao = vo.asBigDecimal("ICMSRETENCAO");
        this.isentasIcms = vo.asBigDecimal("ISENTASICMS");
        this.isentasIpi = vo.asBigDecimal("ISENTASIPI");
        this.numLanc = vo.asBigDecimal("NUMLANC");
        this.numNota = vo.asBigDecimal("NUMNOTA");
        this.numNota2 = vo.asBigDecimal("NUMNOTA2");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.observacao = vo.asString("OBSERVACAO");
        this.origem = vo.asString("ORIGEM");
        this.outrasIcms = vo.asBigDecimal("OUTRASICMS");
        this.outrasIpi = vo.asBigDecimal("OUTRASIPI");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.serieNota = vo.asString("SERIENOTA");
        this.tipIcms = vo.asString("TIPICMS");
        this.tipIpi = vo.asString("TIPIPI");
        this.ufDestino = vo.asString("UFDESTINO");
        this.ufOrigem = vo.asString("UFORIGEM");
        this.vlrCtb = vo.asBigDecimal("VLRCTB");
        this.vlrCtbTare = vo.asBigDecimal("VLRCTBTARE");
        this.vlrIcms = vo.asBigDecimal("VLRICMS");
        this.vlrIcmsTare = vo.asBigDecimal("VLRICMSTARE");
        this.vlrIpi = vo.asBigDecimal("VLRIPI");
        this.vlrTare = vo.asBigDecimal("VLRTARE");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.codTrib = vo.asBigDecimal("CODTRIB");
        this.dhMov = vo.asTimestamp("DHMOV");
        this.difIcms = vo.asBigDecimal("DIFICMS");
        this.digitado = vo.asString("DIGITADO");
        this.dtDoc = vo.asTimestamp("DTDOC");
        this.chaveCte = vo.asString("CHAVECTE");
        this.chaveCteRef = vo.asString("CHAVECTEREF");
        this.chaveNfe = vo.asString("CHAVENFE");
        this.codAntecipSt = vo.asString("CODANTECIPST");
        this.codCfo = vo.asBigDecimal("CODCFO");
        this.codCtaCtb = vo.asBigDecimal("CODCTACTB");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.aliqIcms = vo.asBigDecimal("ALIQICMS");
        this.aliqIpi = vo.asBigDecimal("ALIQIPI");
        this.baseIcms = vo.asBigDecimal("BASEICMS");
        this.baseIcmsTare = vo.asBigDecimal("BASEICMSTARE");
        this.baseIpi = vo.asBigDecimal("BASEIPI");
        this.baseRetencao = vo.asBigDecimal("BASERETENCAO");
        this.codEmpOrig = vo.asBigDecimal("CODEMPORIG");
        this.baseRetencaoSemRed = vo.asBigDecimal("BASERETENCAOSEMRED");
        this.dtFilt = vo.asTimestamp("DTFILT");
        this.dtEntSaiInfo = vo.asTimestamp("DTENTSAIINFO");
        this.vlrIcmsCompl = vo.asBigDecimal("VLRICMSCOMPL");
        this.ufEntrega = vo.asString("UFENTREGA");
        this.codContatoEntrega = vo.asBigDecimal("CODCONTATOENTREGA");
        this.codCidFimCte = vo.asBigDecimal("CODCIDFIMCTE");
        this.codCidIniCte = vo.asBigDecimal("CODCIDINICTE");
        this.vlrIcmsDifalRem = vo.asBigDecimal("VLRICMSDIFALREM");
        this.vlrIcmsFcp = vo.asBigDecimal("VLRICMSFCP");
        this.vlrStFcpInt = vo.asBigDecimal("VLRSTFCPINT");
        this.vlrIcmsFcpInt = vo.asBigDecimal("VLRICMSFCPINT");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.vlrIcmsDifalDest = vo.asBigDecimal("VLRICMSDIFALDEST");
        this.codTipOper = vo.asBigDecimal("CODTIPOPER");
        this.descrEmpParc = vo.asString("DESCR_EMP_PARC");
        this.dtCanc = vo.asTimestamp("DTCANC");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.tipMov = vo.asString("TIPMOV");
        return this;
   }
}
