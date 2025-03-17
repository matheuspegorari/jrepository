package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class NotaCancelada implements SankhyaEntity<NotaCancelada> {

   private BigDecimal codModDoc;
   private BigDecimal codParc;
   private String atualliviss;
   private String chaveNfe;
   private BigDecimal codEmp;
   private BigDecimal codMaq;
   private String numProtocCancCte;
   private BigDecimal tpEmisCte;
   private Timestamp dhProtocCancCte;
   private String tpAmbNfe;
   private BigDecimal nuNotaSub;
   private String numProtocCte;
   private Timestamp dhProtocCte;
   private String chaveCte;
   private String tpAmbCte;
   private Timestamp dhProtocCan;
   private Timestamp dhProtocEspont;
   private Timestamp dhProtocNfe;
   private Timestamp dhRegdPec;
   private Timestamp dtCanc;
   private Timestamp dtFatur;
   private Timestamp dtMov;
   private Timestamp dtNeg;
   private String modeloNfdEs;
   private String motCancel;
   private String naturezaOperDes;
   private BigDecimal nroRedz;
   private BigDecimal numCf;
   private String numNfse;
   private BigDecimal numNota;
   private String numProtocCan;
   private String numProtocEspont;
   private String numProtocNfe;
   private String numRegdPec;
   private BigDecimal nuNota;
   private BigDecimal nuRem;
   private String serieNfdEs;
   private String serieNota;
   private BigDecimal tpEmisNfe;
   private BigDecimal vlrNota;
   private String atuallivFis;
   private Timestamp dhCancPrefNfse;
   private String protCancNfse;
   private String tipCancNfse;
   private String tpAmbNfse;
   private BigDecimal idPontuacaoParceria;
   private String nfseCabCext;
   private String statusVm;

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

   public String getAtualliviss() {
        return atualliviss;
   }

   public void setAtualliviss(String atualliviss) {
        this.atualliviss = atualliviss;
   }

   public String getChaveNfe() {
        return chaveNfe;
   }

   public void setChaveNfe(String chaveNfe) {
        this.chaveNfe = chaveNfe;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public BigDecimal getCodMaq() {
        return codMaq;
   }

   public void setCodMaq(BigDecimal codMaq) {
        this.codMaq = codMaq;
   }

   public String getNumProtocCancCte() {
        return numProtocCancCte;
   }

   public void setNumProtocCancCte(String numProtocCancCte) {
        this.numProtocCancCte = numProtocCancCte;
   }

   public BigDecimal getTpEmisCte() {
        return tpEmisCte;
   }

   public void setTpEmisCte(BigDecimal tpEmisCte) {
        this.tpEmisCte = tpEmisCte;
   }

   public Timestamp getDhProtocCancCte() {
        return dhProtocCancCte;
   }

   public void setDhProtocCancCte(Timestamp dhProtocCancCte) {
        this.dhProtocCancCte = dhProtocCancCte;
   }

   public String getTpAmbNfe() {
        return tpAmbNfe;
   }

   public void setTpAmbNfe(String tpAmbNfe) {
        this.tpAmbNfe = tpAmbNfe;
   }

   public BigDecimal getNuNotaSub() {
        return nuNotaSub;
   }

   public void setNuNotaSub(BigDecimal nuNotaSub) {
        this.nuNotaSub = nuNotaSub;
   }

   public String getNumProtocCte() {
        return numProtocCte;
   }

   public void setNumProtocCte(String numProtocCte) {
        this.numProtocCte = numProtocCte;
   }

   public Timestamp getDhProtocCte() {
        return dhProtocCte;
   }

   public void setDhProtocCte(Timestamp dhProtocCte) {
        this.dhProtocCte = dhProtocCte;
   }

   public String getChaveCte() {
        return chaveCte;
   }

   public void setChaveCte(String chaveCte) {
        this.chaveCte = chaveCte;
   }

   public String getTpAmbCte() {
        return tpAmbCte;
   }

   public void setTpAmbCte(String tpAmbCte) {
        this.tpAmbCte = tpAmbCte;
   }

   public Timestamp getDhProtocCan() {
        return dhProtocCan;
   }

   public void setDhProtocCan(Timestamp dhProtocCan) {
        this.dhProtocCan = dhProtocCan;
   }

   public Timestamp getDhProtocEspont() {
        return dhProtocEspont;
   }

   public void setDhProtocEspont(Timestamp dhProtocEspont) {
        this.dhProtocEspont = dhProtocEspont;
   }

   public Timestamp getDhProtocNfe() {
        return dhProtocNfe;
   }

   public void setDhProtocNfe(Timestamp dhProtocNfe) {
        this.dhProtocNfe = dhProtocNfe;
   }

   public Timestamp getDhRegdPec() {
        return dhRegdPec;
   }

   public void setDhRegdPec(Timestamp dhRegdPec) {
        this.dhRegdPec = dhRegdPec;
   }

   public Timestamp getDtCanc() {
        return dtCanc;
   }

   public void setDtCanc(Timestamp dtCanc) {
        this.dtCanc = dtCanc;
   }

   public Timestamp getDtFatur() {
        return dtFatur;
   }

   public void setDtFatur(Timestamp dtFatur) {
        this.dtFatur = dtFatur;
   }

   public Timestamp getDtMov() {
        return dtMov;
   }

   public void setDtMov(Timestamp dtMov) {
        this.dtMov = dtMov;
   }

   public Timestamp getDtNeg() {
        return dtNeg;
   }

   public void setDtNeg(Timestamp dtNeg) {
        this.dtNeg = dtNeg;
   }

   public String getModeloNfdEs() {
        return modeloNfdEs;
   }

   public void setModeloNfdEs(String modeloNfdEs) {
        this.modeloNfdEs = modeloNfdEs;
   }

   public String getMotCancel() {
        return motCancel;
   }

   public void setMotCancel(String motCancel) {
        this.motCancel = motCancel;
   }

   public String getNaturezaOperDes() {
        return naturezaOperDes;
   }

   public void setNaturezaOperDes(String naturezaOperDes) {
        this.naturezaOperDes = naturezaOperDes;
   }

   public BigDecimal getNroRedz() {
        return nroRedz;
   }

   public void setNroRedz(BigDecimal nroRedz) {
        this.nroRedz = nroRedz;
   }

   public BigDecimal getNumCf() {
        return numCf;
   }

   public void setNumCf(BigDecimal numCf) {
        this.numCf = numCf;
   }

   public String getNumNfse() {
        return numNfse;
   }

   public void setNumNfse(String numNfse) {
        this.numNfse = numNfse;
   }

   public BigDecimal getNumNota() {
        return numNota;
   }

   public void setNumNota(BigDecimal numNota) {
        this.numNota = numNota;
   }

   public String getNumProtocCan() {
        return numProtocCan;
   }

   public void setNumProtocCan(String numProtocCan) {
        this.numProtocCan = numProtocCan;
   }

   public String getNumProtocEspont() {
        return numProtocEspont;
   }

   public void setNumProtocEspont(String numProtocEspont) {
        this.numProtocEspont = numProtocEspont;
   }

   public String getNumProtocNfe() {
        return numProtocNfe;
   }

   public void setNumProtocNfe(String numProtocNfe) {
        this.numProtocNfe = numProtocNfe;
   }

   public String getNumRegdPec() {
        return numRegdPec;
   }

   public void setNumRegdPec(String numRegdPec) {
        this.numRegdPec = numRegdPec;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        this.nuNota = nuNota;
   }

   public BigDecimal getNuRem() {
        return nuRem;
   }

   public void setNuRem(BigDecimal nuRem) {
        this.nuRem = nuRem;
   }

   public String getSerieNfdEs() {
        return serieNfdEs;
   }

   public void setSerieNfdEs(String serieNfdEs) {
        this.serieNfdEs = serieNfdEs;
   }

   public String getSerieNota() {
        return serieNota;
   }

   public void setSerieNota(String serieNota) {
        this.serieNota = serieNota;
   }

   public BigDecimal getTpEmisNfe() {
        return tpEmisNfe;
   }

   public void setTpEmisNfe(BigDecimal tpEmisNfe) {
        this.tpEmisNfe = tpEmisNfe;
   }

   public BigDecimal getVlrNota() {
        return vlrNota;
   }

   public void setVlrNota(BigDecimal vlrNota) {
        this.vlrNota = vlrNota;
   }

   public String getAtuallivFis() {
        return atuallivFis;
   }

   public void setAtuallivFis(String atuallivFis) {
        this.atuallivFis = atuallivFis;
   }

   public Timestamp getDhCancPrefNfse() {
        return dhCancPrefNfse;
   }

   public void setDhCancPrefNfse(Timestamp dhCancPrefNfse) {
        this.dhCancPrefNfse = dhCancPrefNfse;
   }

   public String getProtCancNfse() {
        return protCancNfse;
   }

   public void setProtCancNfse(String protCancNfse) {
        this.protCancNfse = protCancNfse;
   }

   public String getTipCancNfse() {
        return tipCancNfse;
   }

   public void setTipCancNfse(String tipCancNfse) {
        this.tipCancNfse = tipCancNfse;
   }

   public String getTpAmbNfse() {
        return tpAmbNfse;
   }

   public void setTpAmbNfse(String tpAmbNfse) {
        this.tpAmbNfse = tpAmbNfse;
   }

   public BigDecimal getIdPontuacaoParceria() {
        return idPontuacaoParceria;
   }

   public void setIdPontuacaoParceria(BigDecimal idPontuacaoParceria) {
        this.idPontuacaoParceria = idPontuacaoParceria;
   }

   public String getNfseCabCext() {
        return nfseCabCext;
   }

   public void setNfseCabCext(String nfseCabCext) {
        this.nfseCabCext = nfseCabCext;
   }

   public String getStatusVm() {
        return statusVm;
   }

   public void setStatusVm(String statusVm) {
        this.statusVm = statusVm;
   }

   @Override
   public String getEntityName() {
        return "NotaCancelada";
   }

   @Override
   public NotaCancelada fromVO(DynamicVO vo) {
        this.codModDoc = vo.asBigDecimal("CODMODDOC");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.atualliviss = vo.asString("ATUALLIVISS");
        this.chaveNfe = vo.asString("CHAVENFE");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codMaq = vo.asBigDecimal("CODMAQ");
        this.numProtocCancCte = vo.asString("NUMPROTOCCANCCTE");
        this.tpEmisCte = vo.asBigDecimal("TPEMISCTE");
        this.dhProtocCancCte = vo.asTimestamp("DHPROTOCCANCCTE");
        this.tpAmbNfe = vo.asString("TPAMBNFE");
        this.nuNotaSub = vo.asBigDecimal("NUNOTASUB");
        this.numProtocCte = vo.asString("NUMPROTOCCTE");
        this.dhProtocCte = vo.asTimestamp("DHPROTOCCTE");
        this.chaveCte = vo.asString("CHAVECTE");
        this.tpAmbCte = vo.asString("TPAMBCTE");
        this.dhProtocCan = vo.asTimestamp("DHPROTOCCAN");
        this.dhProtocEspont = vo.asTimestamp("DHPROTOCESPONT");
        this.dhProtocNfe = vo.asTimestamp("DHPROTOCNFE");
        this.dhRegdPec = vo.asTimestamp("DHREGDPEC");
        this.dtCanc = vo.asTimestamp("DTCANC");
        this.dtFatur = vo.asTimestamp("DTFATUR");
        this.dtMov = vo.asTimestamp("DTMOV");
        this.dtNeg = vo.asTimestamp("DTNEG");
        this.modeloNfdEs = vo.asString("MODELONFDES");
        this.motCancel = vo.asString("MOTCANCEL");
        this.naturezaOperDes = vo.asString("NATUREZAOPERDES");
        this.nroRedz = vo.asBigDecimal("NROREDZ");
        this.numCf = vo.asBigDecimal("NUMCF");
        this.numNfse = vo.asString("NUMNFSE");
        this.numNota = vo.asBigDecimal("NUMNOTA");
        this.numProtocCan = vo.asString("NUMPROTOCCAN");
        this.numProtocEspont = vo.asString("NUMPROTOCESPONT");
        this.numProtocNfe = vo.asString("NUMPROTOCNFE");
        this.numRegdPec = vo.asString("NUMREGDPEC");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.nuRem = vo.asBigDecimal("NUREM");
        this.serieNfdEs = vo.asString("SERIENFDES");
        this.serieNota = vo.asString("SERIENOTA");
        this.tpEmisNfe = vo.asBigDecimal("TPEMISNFE");
        this.vlrNota = vo.asBigDecimal("VLRNOTA");
        this.atuallivFis = vo.asString("ATUALLIVFIS");
        this.dhCancPrefNfse = vo.asTimestamp("DHCANCPREFNFSE");
        this.protCancNfse = vo.asString("PROTCANCNFSE");
        this.tipCancNfse = vo.asString("TIPCANCNFSE");
        this.tpAmbNfse = vo.asString("TPAMBNFSE");
        this.idPontuacaoParceria = vo.asBigDecimal("IDPONTUACAOPARCERIA");
        this.nfseCabCext = vo.asString("NFSECABCEXT");
        this.statusVm = vo.asString("STATUSVM");
        return this;
   }
}
