package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class NotaCancelada extends AbstractSankhyaEntity<NotaCancelada> {
   private BigDecimal codModDoc;
   private BigDecimal codParc;
   private String atualliviss;
   private String chaveNfe;
   private BigDecimal codEmp;
   private BigDecimal codMaq;
   private String numProtocCancTec;
   private BigDecimal tpEmisCte;
   private Timestamp dhProtocCancTec;
   private String tpAmbNfe;
   private BigDecimal nuNotaSub;
   private String numProtocCte;
   private Timestamp dhProtocCte;
   private String chaveCte;
   private String tpAmbCte;
   private Timestamp dhProtocCan;
   private Timestamp dhProtocEspont;
   private Timestamp dhProtocNfe;
   private Timestamp dhRegDpec;
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
   private String numRegDpec;
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
        markAsChanged("CODMODDOC", codModDoc);
        this.codModDoc = codModDoc;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
        this.codParc = codParc;
   }

   public String getAtualliviss() {
        return atualliviss;
   }

   public void setAtualliviss(String atualliviss) {
        markAsChanged("ATUALLIVISS", atualliviss);
        this.atualliviss = atualliviss;
   }

   public String getChaveNfe() {
        return chaveNfe;
   }

   public void setChaveNfe(String chaveNfe) {
        markAsChanged("CHAVENFE", chaveNfe);
        this.chaveNfe = chaveNfe;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public BigDecimal getCodMaq() {
        return codMaq;
   }

   public void setCodMaq(BigDecimal codMaq) {
        markAsChanged("CODMAQ", codMaq);
        this.codMaq = codMaq;
   }

   public String getNumProtocCancTec() {
        return numProtocCancTec;
   }

   public void setNumProtocCancTec(String numProtocCancTec) {
        markAsChanged("NUMPROTOCCANCTE", numProtocCancTec);
        this.numProtocCancTec = numProtocCancTec;
   }

   public BigDecimal getTpEmisCte() {
        return tpEmisCte;
   }

   public void setTpEmisCte(BigDecimal tpEmisCte) {
        markAsChanged("TPEMISCTE", tpEmisCte);
        this.tpEmisCte = tpEmisCte;
   }

   public Timestamp getDhProtocCancTec() {
        return dhProtocCancTec;
   }

   public void setDhProtocCancTec(Timestamp dhProtocCancTec) {
        markAsChanged("DHPROTOCCANCTE", dhProtocCancTec);
        this.dhProtocCancTec = dhProtocCancTec;
   }

   public String getTpAmbNfe() {
        return tpAmbNfe;
   }

   public void setTpAmbNfe(String tpAmbNfe) {
        markAsChanged("TPAMBNFE", tpAmbNfe);
        this.tpAmbNfe = tpAmbNfe;
   }

   public BigDecimal getNuNotaSub() {
        return nuNotaSub;
   }

   public void setNuNotaSub(BigDecimal nuNotaSub) {
        markAsChanged("NUNOTASUB", nuNotaSub);
        this.nuNotaSub = nuNotaSub;
   }

   public String getNumProtocCte() {
        return numProtocCte;
   }

   public void setNumProtocCte(String numProtocCte) {
        markAsChanged("NUMPROTOCCTE", numProtocCte);
        this.numProtocCte = numProtocCte;
   }

   public Timestamp getDhProtocCte() {
        return dhProtocCte;
   }

   public void setDhProtocCte(Timestamp dhProtocCte) {
        markAsChanged("DHPROTOCCTE", dhProtocCte);
        this.dhProtocCte = dhProtocCte;
   }

   public String getChaveCte() {
        return chaveCte;
   }

   public void setChaveCte(String chaveCte) {
        markAsChanged("CHAVECTE", chaveCte);
        this.chaveCte = chaveCte;
   }

   public String getTpAmbCte() {
        return tpAmbCte;
   }

   public void setTpAmbCte(String tpAmbCte) {
        markAsChanged("TPAMBCTE", tpAmbCte);
        this.tpAmbCte = tpAmbCte;
   }

   public Timestamp getDhProtocCan() {
        return dhProtocCan;
   }

   public void setDhProtocCan(Timestamp dhProtocCan) {
        markAsChanged("DHPROTOCCAN", dhProtocCan);
        this.dhProtocCan = dhProtocCan;
   }

   public Timestamp getDhProtocEspont() {
        return dhProtocEspont;
   }

   public void setDhProtocEspont(Timestamp dhProtocEspont) {
        markAsChanged("DHPROTOCESPONT", dhProtocEspont);
        this.dhProtocEspont = dhProtocEspont;
   }

   public Timestamp getDhProtocNfe() {
        return dhProtocNfe;
   }

   public void setDhProtocNfe(Timestamp dhProtocNfe) {
        markAsChanged("DHPROTOCNFE", dhProtocNfe);
        this.dhProtocNfe = dhProtocNfe;
   }

   public Timestamp getDhRegDpec() {
        return dhRegDpec;
   }

   public void setDhRegDpec(Timestamp dhRegDpec) {
        markAsChanged("DHREGDPEC", dhRegDpec);
        this.dhRegDpec = dhRegDpec;
   }

   public Timestamp getDtCanc() {
        return dtCanc;
   }

   public void setDtCanc(Timestamp dtCanc) {
        markAsChanged("DTCANC", dtCanc);
        this.dtCanc = dtCanc;
   }

   public Timestamp getDtFatur() {
        return dtFatur;
   }

   public void setDtFatur(Timestamp dtFatur) {
        markAsChanged("DTFATUR", dtFatur);
        this.dtFatur = dtFatur;
   }

   public Timestamp getDtMov() {
        return dtMov;
   }

   public void setDtMov(Timestamp dtMov) {
        markAsChanged("DTMOV", dtMov);
        this.dtMov = dtMov;
   }

   public Timestamp getDtNeg() {
        return dtNeg;
   }

   public void setDtNeg(Timestamp dtNeg) {
        markAsChanged("DTNEG", dtNeg);
        this.dtNeg = dtNeg;
   }

   public String getModeloNfdEs() {
        return modeloNfdEs;
   }

   public void setModeloNfdEs(String modeloNfdEs) {
        markAsChanged("MODELONFDES", modeloNfdEs);
        this.modeloNfdEs = modeloNfdEs;
   }

   public String getMotCancel() {
        return motCancel;
   }

   public void setMotCancel(String motCancel) {
        markAsChanged("MOTCANCEL", motCancel);
        this.motCancel = motCancel;
   }

   public String getNaturezaOperDes() {
        return naturezaOperDes;
   }

   public void setNaturezaOperDes(String naturezaOperDes) {
        markAsChanged("NATUREZAOPERDES", naturezaOperDes);
        this.naturezaOperDes = naturezaOperDes;
   }

   public BigDecimal getNroRedz() {
        return nroRedz;
   }

   public void setNroRedz(BigDecimal nroRedz) {
        markAsChanged("NROREDZ", nroRedz);
        this.nroRedz = nroRedz;
   }

   public BigDecimal getNumCf() {
        return numCf;
   }

   public void setNumCf(BigDecimal numCf) {
        markAsChanged("NUMCF", numCf);
        this.numCf = numCf;
   }

   public String getNumNfse() {
        return numNfse;
   }

   public void setNumNfse(String numNfse) {
        markAsChanged("NUMNFSE", numNfse);
        this.numNfse = numNfse;
   }

   public BigDecimal getNumNota() {
        return numNota;
   }

   public void setNumNota(BigDecimal numNota) {
        markAsChanged("NUMNOTA", numNota);
        this.numNota = numNota;
   }

   public String getNumProtocCan() {
        return numProtocCan;
   }

   public void setNumProtocCan(String numProtocCan) {
        markAsChanged("NUMPROTOCCAN", numProtocCan);
        this.numProtocCan = numProtocCan;
   }

   public String getNumProtocEspont() {
        return numProtocEspont;
   }

   public void setNumProtocEspont(String numProtocEspont) {
        markAsChanged("NUMPROTOCESPONT", numProtocEspont);
        this.numProtocEspont = numProtocEspont;
   }

   public String getNumProtocNfe() {
        return numProtocNfe;
   }

   public void setNumProtocNfe(String numProtocNfe) {
        markAsChanged("NUMPROTOCNFE", numProtocNfe);
        this.numProtocNfe = numProtocNfe;
   }

   public String getNumRegDpec() {
        return numRegDpec;
   }

   public void setNumRegDpec(String numRegDpec) {
        markAsChanged("NUMREGDPEC", numRegDpec);
        this.numRegDpec = numRegDpec;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
        this.nuNota = nuNota;
   }

   public BigDecimal getNuRem() {
        return nuRem;
   }

   public void setNuRem(BigDecimal nuRem) {
        markAsChanged("NUREM", nuRem);
        this.nuRem = nuRem;
   }

   public String getSerieNfdEs() {
        return serieNfdEs;
   }

   public void setSerieNfdEs(String serieNfdEs) {
        markAsChanged("SERIENFDES", serieNfdEs);
        this.serieNfdEs = serieNfdEs;
   }

   public String getSerieNota() {
        return serieNota;
   }

   public void setSerieNota(String serieNota) {
        markAsChanged("SERIENOTA", serieNota);
        this.serieNota = serieNota;
   }

   public BigDecimal getTpEmisNfe() {
        return tpEmisNfe;
   }

   public void setTpEmisNfe(BigDecimal tpEmisNfe) {
        markAsChanged("TPEMISNFE", tpEmisNfe);
        this.tpEmisNfe = tpEmisNfe;
   }

   public BigDecimal getVlrNota() {
        return vlrNota;
   }

   public void setVlrNota(BigDecimal vlrNota) {
        markAsChanged("VLRNOTA", vlrNota);
        this.vlrNota = vlrNota;
   }

   public String getAtuallivFis() {
        return atuallivFis;
   }

   public void setAtuallivFis(String atuallivFis) {
        markAsChanged("ATUALLIVFIS", atuallivFis);
        this.atuallivFis = atuallivFis;
   }

   public Timestamp getDhCancPrefNfse() {
        return dhCancPrefNfse;
   }

   public void setDhCancPrefNfse(Timestamp dhCancPrefNfse) {
        markAsChanged("DHCANCPREFNFSE", dhCancPrefNfse);
        this.dhCancPrefNfse = dhCancPrefNfse;
   }

   public String getProtCancNfse() {
        return protCancNfse;
   }

   public void setProtCancNfse(String protCancNfse) {
        markAsChanged("PROTCANCNFSE", protCancNfse);
        this.protCancNfse = protCancNfse;
   }

   public String getTipCancNfse() {
        return tipCancNfse;
   }

   public void setTipCancNfse(String tipCancNfse) {
        markAsChanged("TIPCANCNFSE", tipCancNfse);
        this.tipCancNfse = tipCancNfse;
   }

   public String getTpAmbNfse() {
        return tpAmbNfse;
   }

   public void setTpAmbNfse(String tpAmbNfse) {
        markAsChanged("TPAMBNFSE", tpAmbNfse);
        this.tpAmbNfse = tpAmbNfse;
   }

   public BigDecimal getIdPontuacaoParceria() {
        return idPontuacaoParceria;
   }

   public void setIdPontuacaoParceria(BigDecimal idPontuacaoParceria) {
        markAsChanged("IDPONTUACAOPARCERIA", idPontuacaoParceria);
        this.idPontuacaoParceria = idPontuacaoParceria;
   }

   public String getNfseCabCext() {
        return nfseCabCext;
   }

   public void setNfseCabCext(String nfseCabCext) {
        markAsChanged("NFSECABCEXT", nfseCabCext);
        this.nfseCabCext = nfseCabCext;
   }

   public String getStatusVm() {
        return statusVm;
   }

   public void setStatusVm(String statusVm) {
        markAsChanged("STATUSVM", statusVm);
        this.statusVm = statusVm;
   }

   @Override
   public String getTableName() {
        return "TGFCAN";
   }

   @Override
   public String getEntityName() {
        return "NotaCancelada";
   }

   @Override
   public NotaCancelada fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.codModDoc = vo.asBigDecimal("CODMODDOC");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.atualliviss = vo.asString("ATUALLIVISS");
        this.chaveNfe = vo.asString("CHAVENFE");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codMaq = vo.asBigDecimal("CODMAQ");
        this.numProtocCancTec = vo.asString("NUMPROTOCCANCTE");
        this.tpEmisCte = vo.asBigDecimal("TPEMISCTE");
        this.dhProtocCancTec = vo.asTimestamp("DHPROTOCCANCTE");
        this.tpAmbNfe = vo.asString("TPAMBNFE");
        this.nuNotaSub = vo.asBigDecimal("NUNOTASUB");
        this.numProtocCte = vo.asString("NUMPROTOCCTE");
        this.dhProtocCte = vo.asTimestamp("DHPROTOCCTE");
        this.chaveCte = vo.asString("CHAVECTE");
        this.tpAmbCte = vo.asString("TPAMBCTE");
        this.dhProtocCan = vo.asTimestamp("DHPROTOCCAN");
        this.dhProtocEspont = vo.asTimestamp("DHPROTOCESPONT");
        this.dhProtocNfe = vo.asTimestamp("DHPROTOCNFE");
        this.dhRegDpec = vo.asTimestamp("DHREGDPEC");
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
        this.numRegDpec = vo.asString("NUMREGDPEC");
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
