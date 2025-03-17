package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class MovimentoLivroFiscal implements SankhyaEntity<MovimentoLivroFiscal> {

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
   private BigDecimal vlrCtbtare;
   private BigDecimal vlrIcms;
   private BigDecimal vlrIcmstare;
   private BigDecimal vlrIpi;
   private BigDecimal vlrTare;
   private BigDecimal codParc;
   private BigDecimal codTrib;
   private Timestamp dhMov;
   private BigDecimal difIcms;
   private String digitado;
   private Timestamp dtDoc;
   private String chaveCte;
   private String chaveCteref;
   private String chaveNfe;
   private String codAntecipst;
   private BigDecimal codCfo;
   private BigDecimal codCtactb;
   private BigDecimal codEmp;
   private BigDecimal aliqIcms;
   private BigDecimal aliqIpi;
   private BigDecimal baseIcms;
   private BigDecimal baseIcmstare;
   private BigDecimal baseIpi;
   private BigDecimal baseRetencao;
   private BigDecimal codEmporig;
   private BigDecimal baseRetencaosemred;
   private Timestamp dtFilt;
   private Timestamp dtEntsaiinfo;
   private BigDecimal vlrIcmscompl;
   private String ufEntrega;
   private BigDecimal codContatoentrega;
   private BigDecimal codCidfimcte;
   private BigDecimal codCidinictE;
   private BigDecimal vlrIcmsdifalrem;
   private BigDecimal vlrIcmsfcp;
   private BigDecimal vlrStfcpint;
   private BigDecimal vlrIcmsfcpint;
   private BigDecimal codProd;
   private BigDecimal vlrIcmsdifaldest;
   private BigDecimal codTipoper;
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

   public BigDecimal getVlrCtbtare() {
        return vlrCtbtare;
   }

   public void setVlrCtbtare(BigDecimal vlrCtbtare) {
        this.vlrCtbtare = vlrCtbtare;
   }

   public BigDecimal getVlrIcms() {
        return vlrIcms;
   }

   public void setVlrIcms(BigDecimal vlrIcms) {
        this.vlrIcms = vlrIcms;
   }

   public BigDecimal getVlrIcmstare() {
        return vlrIcmstare;
   }

   public void setVlrIcmstare(BigDecimal vlrIcmstare) {
        this.vlrIcmstare = vlrIcmstare;
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

   public String getChaveCteref() {
        return chaveCteref;
   }

   public void setChaveCteref(String chaveCteref) {
        this.chaveCteref = chaveCteref;
   }

   public String getChaveNfe() {
        return chaveNfe;
   }

   public void setChaveNfe(String chaveNfe) {
        this.chaveNfe = chaveNfe;
   }

   public String getCodAntecipst() {
        return codAntecipst;
   }

   public void setCodAntecipst(String codAntecipst) {
        this.codAntecipst = codAntecipst;
   }

   public BigDecimal getCodCfo() {
        return codCfo;
   }

   public void setCodCfo(BigDecimal codCfo) {
        this.codCfo = codCfo;
   }

   public BigDecimal getCodCtactb() {
        return codCtactb;
   }

   public void setCodCtactb(BigDecimal codCtactb) {
        this.codCtactb = codCtactb;
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

   public BigDecimal getBaseIcmstare() {
        return baseIcmstare;
   }

   public void setBaseIcmstare(BigDecimal baseIcmstare) {
        this.baseIcmstare = baseIcmstare;
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

   public BigDecimal getCodEmporig() {
        return codEmporig;
   }

   public void setCodEmporig(BigDecimal codEmporig) {
        this.codEmporig = codEmporig;
   }

   public BigDecimal getBaseRetencaosemred() {
        return baseRetencaosemred;
   }

   public void setBaseRetencaosemred(BigDecimal baseRetencaosemred) {
        this.baseRetencaosemred = baseRetencaosemred;
   }

   public Timestamp getDtFilt() {
        return dtFilt;
   }

   public void setDtFilt(Timestamp dtFilt) {
        this.dtFilt = dtFilt;
   }

   public Timestamp getDtEntsaiinfo() {
        return dtEntsaiinfo;
   }

   public void setDtEntsaiinfo(Timestamp dtEntsaiinfo) {
        this.dtEntsaiinfo = dtEntsaiinfo;
   }

   public BigDecimal getVlrIcmscompl() {
        return vlrIcmscompl;
   }

   public void setVlrIcmscompl(BigDecimal vlrIcmscompl) {
        this.vlrIcmscompl = vlrIcmscompl;
   }

   public String getUfEntrega() {
        return ufEntrega;
   }

   public void setUfEntrega(String ufEntrega) {
        this.ufEntrega = ufEntrega;
   }

   public BigDecimal getCodContatoentrega() {
        return codContatoentrega;
   }

   public void setCodContatoentrega(BigDecimal codContatoentrega) {
        this.codContatoentrega = codContatoentrega;
   }

   public BigDecimal getCodCidfimcte() {
        return codCidfimcte;
   }

   public void setCodCidfimcte(BigDecimal codCidfimcte) {
        this.codCidfimcte = codCidfimcte;
   }

   public BigDecimal getCodCidinictE() {
        return codCidinictE;
   }

   public void setCodCidinictE(BigDecimal codCidinictE) {
        this.codCidinictE = codCidinictE;
   }

   public BigDecimal getVlrIcmsdifalrem() {
        return vlrIcmsdifalrem;
   }

   public void setVlrIcmsdifalrem(BigDecimal vlrIcmsdifalrem) {
        this.vlrIcmsdifalrem = vlrIcmsdifalrem;
   }

   public BigDecimal getVlrIcmsfcp() {
        return vlrIcmsfcp;
   }

   public void setVlrIcmsfcp(BigDecimal vlrIcmsfcp) {
        this.vlrIcmsfcp = vlrIcmsfcp;
   }

   public BigDecimal getVlrStfcpint() {
        return vlrStfcpint;
   }

   public void setVlrStfcpint(BigDecimal vlrStfcpint) {
        this.vlrStfcpint = vlrStfcpint;
   }

   public BigDecimal getVlrIcmsfcpint() {
        return vlrIcmsfcpint;
   }

   public void setVlrIcmsfcpint(BigDecimal vlrIcmsfcpint) {
        this.vlrIcmsfcpint = vlrIcmsfcpint;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        this.codProd = codProd;
   }

   public BigDecimal getVlrIcmsdifaldest() {
        return vlrIcmsdifaldest;
   }

   public void setVlrIcmsdifaldest(BigDecimal vlrIcmsdifaldest) {
        this.vlrIcmsdifaldest = vlrIcmsdifaldest;
   }

   public BigDecimal getCodTipoper() {
        return codTipoper;
   }

   public void setCodTipoper(BigDecimal codTipoper) {
        this.codTipoper = codTipoper;
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
        this.vlrCtbtare = vo.asBigDecimal("VLRCTBTARE");
        this.vlrIcms = vo.asBigDecimal("VLRICMS");
        this.vlrIcmstare = vo.asBigDecimal("VLRICMSTARE");
        this.vlrIpi = vo.asBigDecimal("VLRIPI");
        this.vlrTare = vo.asBigDecimal("VLRTARE");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.codTrib = vo.asBigDecimal("CODTRIB");
        this.dhMov = vo.asTimestamp("DHMOV");
        this.difIcms = vo.asBigDecimal("DIFICMS");
        this.digitado = vo.asString("DIGITADO");
        this.dtDoc = vo.asTimestamp("DTDOC");
        this.chaveCte = vo.asString("CHAVECTE");
        this.chaveCteref = vo.asString("CHAVECTEREF");
        this.chaveNfe = vo.asString("CHAVENFE");
        this.codAntecipst = vo.asString("CODANTECIPST");
        this.codCfo = vo.asBigDecimal("CODCFO");
        this.codCtactb = vo.asBigDecimal("CODCTACTB");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.aliqIcms = vo.asBigDecimal("ALIQICMS");
        this.aliqIpi = vo.asBigDecimal("ALIQIPI");
        this.baseIcms = vo.asBigDecimal("BASEICMS");
        this.baseIcmstare = vo.asBigDecimal("BASEICMSTARE");
        this.baseIpi = vo.asBigDecimal("BASEIPI");
        this.baseRetencao = vo.asBigDecimal("BASERETENCAO");
        this.codEmporig = vo.asBigDecimal("CODEMPORIG");
        this.baseRetencaosemred = vo.asBigDecimal("BASERETENCAOSEMRED");
        this.dtFilt = vo.asTimestamp("DTFILT");
        this.dtEntsaiinfo = vo.asTimestamp("DTENTSAIINFO");
        this.vlrIcmscompl = vo.asBigDecimal("VLRICMSCOMPL");
        this.ufEntrega = vo.asString("UFENTREGA");
        this.codContatoentrega = vo.asBigDecimal("CODCONTATOENTREGA");
        this.codCidfimcte = vo.asBigDecimal("CODCIDFIMCTE");
        this.codCidinictE = vo.asBigDecimal("CODCIDINICTE");
        this.vlrIcmsdifalrem = vo.asBigDecimal("VLRICMSDIFALREM");
        this.vlrIcmsfcp = vo.asBigDecimal("VLRICMSFCP");
        this.vlrStfcpint = vo.asBigDecimal("VLRSTFCPINT");
        this.vlrIcmsfcpint = vo.asBigDecimal("VLRICMSFCPINT");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.vlrIcmsdifaldest = vo.asBigDecimal("VLRICMSDIFALDEST");
        this.codTipoper = vo.asBigDecimal("CODTIPOPER");
        this.descrEmpParc = vo.asString("DESCREMPPARC");
        this.dtCanc = vo.asTimestamp("DTCANC");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.tipMov = vo.asString("TIPMOV");
        return this;
   }
}
