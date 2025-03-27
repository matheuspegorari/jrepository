package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class NotaCancelada extends AbstractSankhyaEntity<NotaCancelada> {
   public BigDecimal getCodModDoc() {
        return this.getVo().asBigDecimal("CODMODDOC");
   }

   public void setCodModDoc(BigDecimal codModDoc) {
        markAsChanged("CODMODDOC", codModDoc);
   }

   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public String getAtualliviss() {
        return this.getVo().asString("ATUALLIVISS");
   }

   public void setAtualliviss(String atualliviss) {
        markAsChanged("ATUALLIVISS", atualliviss);
   }

   public String getChaveNfe() {
        return this.getVo().asString("CHAVENFE");
   }

   public void setChaveNfe(String chaveNfe) {
        markAsChanged("CHAVENFE", chaveNfe);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodMaq() {
        return this.getVo().asBigDecimal("CODMAQ");
   }

   public void setCodMaq(BigDecimal codMaq) {
        markAsChanged("CODMAQ", codMaq);
   }

   public String getNumProtocCancTec() {
        return this.getVo().asString("NUMPROTOCCANCTE");
   }

   public void setNumProtocCancTec(String numProtocCancTec) {
        markAsChanged("NUMPROTOCCANCTE", numProtocCancTec);
   }

   public BigDecimal getTpEmisCte() {
        return this.getVo().asBigDecimal("TPEMISCTE");
   }

   public void setTpEmisCte(BigDecimal tpEmisCte) {
        markAsChanged("TPEMISCTE", tpEmisCte);
   }

   public Timestamp getDhProtocCancTec() {
        return this.getVo().asTimestamp("DHPROTOCCANCTE");
   }

   public void setDhProtocCancTec(Timestamp dhProtocCancTec) {
        markAsChanged("DHPROTOCCANCTE", dhProtocCancTec);
   }

   public String getTpAmbNfe() {
        return this.getVo().asString("TPAMBNFE");
   }

   public void setTpAmbNfe(String tpAmbNfe) {
        markAsChanged("TPAMBNFE", tpAmbNfe);
   }

   public BigDecimal getNuNotaSub() {
        return this.getVo().asBigDecimal("NUNOTASUB");
   }

   public void setNuNotaSub(BigDecimal nuNotaSub) {
        markAsChanged("NUNOTASUB", nuNotaSub);
   }

   public String getNumProtocCte() {
        return this.getVo().asString("NUMPROTOCCTE");
   }

   public void setNumProtocCte(String numProtocCte) {
        markAsChanged("NUMPROTOCCTE", numProtocCte);
   }

   public Timestamp getDhProtocCte() {
        return this.getVo().asTimestamp("DHPROTOCCTE");
   }

   public void setDhProtocCte(Timestamp dhProtocCte) {
        markAsChanged("DHPROTOCCTE", dhProtocCte);
   }

   public String getChaveCte() {
        return this.getVo().asString("CHAVECTE");
   }

   public void setChaveCte(String chaveCte) {
        markAsChanged("CHAVECTE", chaveCte);
   }

   public String getTpAmbCte() {
        return this.getVo().asString("TPAMBCTE");
   }

   public void setTpAmbCte(String tpAmbCte) {
        markAsChanged("TPAMBCTE", tpAmbCte);
   }

   public Timestamp getDhProtocCan() {
        return this.getVo().asTimestamp("DHPROTOCCAN");
   }

   public void setDhProtocCan(Timestamp dhProtocCan) {
        markAsChanged("DHPROTOCCAN", dhProtocCan);
   }

   public Timestamp getDhProtocEspont() {
        return this.getVo().asTimestamp("DHPROTOCESPONT");
   }

   public void setDhProtocEspont(Timestamp dhProtocEspont) {
        markAsChanged("DHPROTOCESPONT", dhProtocEspont);
   }

   public Timestamp getDhProtocNfe() {
        return this.getVo().asTimestamp("DHPROTOCNFE");
   }

   public void setDhProtocNfe(Timestamp dhProtocNfe) {
        markAsChanged("DHPROTOCNFE", dhProtocNfe);
   }

   public Timestamp getDhRegDpec() {
        return this.getVo().asTimestamp("DHREGDPEC");
   }

   public void setDhRegDpec(Timestamp dhRegDpec) {
        markAsChanged("DHREGDPEC", dhRegDpec);
   }

   public Timestamp getDtCanc() {
        return this.getVo().asTimestamp("DTCANC");
   }

   public void setDtCanc(Timestamp dtCanc) {
        markAsChanged("DTCANC", dtCanc);
   }

   public Timestamp getDtFatur() {
        return this.getVo().asTimestamp("DTFATUR");
   }

   public void setDtFatur(Timestamp dtFatur) {
        markAsChanged("DTFATUR", dtFatur);
   }

   public Timestamp getDtMov() {
        return this.getVo().asTimestamp("DTMOV");
   }

   public void setDtMov(Timestamp dtMov) {
        markAsChanged("DTMOV", dtMov);
   }

   public Timestamp getDtNeg() {
        return this.getVo().asTimestamp("DTNEG");
   }

   public void setDtNeg(Timestamp dtNeg) {
        markAsChanged("DTNEG", dtNeg);
   }

   public String getModeloNfdEs() {
        return this.getVo().asString("MODELONFDES");
   }

   public void setModeloNfdEs(String modeloNfdEs) {
        markAsChanged("MODELONFDES", modeloNfdEs);
   }

   public String getMotCancel() {
        return this.getVo().asString("MOTCANCEL");
   }

   public void setMotCancel(String motCancel) {
        markAsChanged("MOTCANCEL", motCancel);
   }

   public String getNaturezaOperDes() {
        return this.getVo().asString("NATUREZAOPERDES");
   }

   public void setNaturezaOperDes(String naturezaOperDes) {
        markAsChanged("NATUREZAOPERDES", naturezaOperDes);
   }

   public BigDecimal getNroRedz() {
        return this.getVo().asBigDecimal("NROREDZ");
   }

   public void setNroRedz(BigDecimal nroRedz) {
        markAsChanged("NROREDZ", nroRedz);
   }

   public BigDecimal getNumCf() {
        return this.getVo().asBigDecimal("NUMCF");
   }

   public void setNumCf(BigDecimal numCf) {
        markAsChanged("NUMCF", numCf);
   }

   public String getNumNfse() {
        return this.getVo().asString("NUMNFSE");
   }

   public void setNumNfse(String numNfse) {
        markAsChanged("NUMNFSE", numNfse);
   }

   public BigDecimal getNumNota() {
        return this.getVo().asBigDecimal("NUMNOTA");
   }

   public void setNumNota(BigDecimal numNota) {
        markAsChanged("NUMNOTA", numNota);
   }

   public String getNumProtocCan() {
        return this.getVo().asString("NUMPROTOCCAN");
   }

   public void setNumProtocCan(String numProtocCan) {
        markAsChanged("NUMPROTOCCAN", numProtocCan);
   }

   public String getNumProtocEspont() {
        return this.getVo().asString("NUMPROTOCESPONT");
   }

   public void setNumProtocEspont(String numProtocEspont) {
        markAsChanged("NUMPROTOCESPONT", numProtocEspont);
   }

   public String getNumProtocNfe() {
        return this.getVo().asString("NUMPROTOCNFE");
   }

   public void setNumProtocNfe(String numProtocNfe) {
        markAsChanged("NUMPROTOCNFE", numProtocNfe);
   }

   public String getNumRegDpec() {
        return this.getVo().asString("NUMREGDPEC");
   }

   public void setNumRegDpec(String numRegDpec) {
        markAsChanged("NUMREGDPEC", numRegDpec);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public BigDecimal getNuRem() {
        return this.getVo().asBigDecimal("NUREM");
   }

   public void setNuRem(BigDecimal nuRem) {
        markAsChanged("NUREM", nuRem);
   }

   public String getSerieNfdEs() {
        return this.getVo().asString("SERIENFDES");
   }

   public void setSerieNfdEs(String serieNfdEs) {
        markAsChanged("SERIENFDES", serieNfdEs);
   }

   public String getSerieNota() {
        return this.getVo().asString("SERIENOTA");
   }

   public void setSerieNota(String serieNota) {
        markAsChanged("SERIENOTA", serieNota);
   }

   public BigDecimal getTpEmisNfe() {
        return this.getVo().asBigDecimal("TPEMISNFE");
   }

   public void setTpEmisNfe(BigDecimal tpEmisNfe) {
        markAsChanged("TPEMISNFE", tpEmisNfe);
   }

   public BigDecimal getVlrNota() {
        return this.getVo().asBigDecimal("VLRNOTA");
   }

   public void setVlrNota(BigDecimal vlrNota) {
        markAsChanged("VLRNOTA", vlrNota);
   }

   public String getAtuallivFis() {
        return this.getVo().asString("ATUALLIVFIS");
   }

   public void setAtuallivFis(String atuallivFis) {
        markAsChanged("ATUALLIVFIS", atuallivFis);
   }

   public Timestamp getDhCancPrefNfse() {
        return this.getVo().asTimestamp("DHCANCPREFNFSE");
   }

   public void setDhCancPrefNfse(Timestamp dhCancPrefNfse) {
        markAsChanged("DHCANCPREFNFSE", dhCancPrefNfse);
   }

   public String getProtCancNfse() {
        return this.getVo().asString("PROTCANCNFSE");
   }

   public void setProtCancNfse(String protCancNfse) {
        markAsChanged("PROTCANCNFSE", protCancNfse);
   }

   public String getTipCancNfse() {
        return this.getVo().asString("TIPCANCNFSE");
   }

   public void setTipCancNfse(String tipCancNfse) {
        markAsChanged("TIPCANCNFSE", tipCancNfse);
   }

   public String getTpAmbNfse() {
        return this.getVo().asString("TPAMBNFSE");
   }

   public void setTpAmbNfse(String tpAmbNfse) {
        markAsChanged("TPAMBNFSE", tpAmbNfse);
   }

   public BigDecimal getIdPontuacaoParceria() {
        return this.getVo().asBigDecimal("IDPONTUACAOPARCERIA");
   }

   public void setIdPontuacaoParceria(BigDecimal idPontuacaoParceria) {
        markAsChanged("IDPONTUACAOPARCERIA", idPontuacaoParceria);
   }

   public String getNfseCabCext() {
        return this.getVo().asString("NFSECABCEXT");
   }

   public void setNfseCabCext(String nfseCabCext) {
        markAsChanged("NFSECABCEXT", nfseCabCext);
   }

   public String getStatusVm() {
        return this.getVo().asString("STATUSVM");
   }

   public void setStatusVm(String statusVm) {
        markAsChanged("STATUSVM", statusVm);
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
        return this;
   }
}
