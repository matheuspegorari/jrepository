package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class LogRegistrosMDe extends AbstractSankhyaEntity<LogRegistrosMDe> {
   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public String getDescRevento() {
        return this.getVo().asString("DESCREVENTO");
   }

   public void setDescRevento(String descRevento) {
        markAsChanged("DESCREVENTO", descRevento);
   }

   public Timestamp getDhEvento() {
        return this.getVo().asTimestamp("DHEVENTO");
   }

   public void setDhEvento(Timestamp dhEvento) {
        markAsChanged("DHEVENTO", dhEvento);
   }

   public String getEmisSterc() {
        return this.getVo().asString("EMISSTERC");
   }

   public void setEmisSterc(String emisSterc) {
        markAsChanged("EMISSTERC", emisSterc);
   }

   public String getInfCompl() {
        return this.getVo().asString("INFCOMPL");
   }

   public void setInfCompl(String infCompl) {
        markAsChanged("INFCOMPL", infCompl);
   }

   public String getJustificativa() {
        return this.getVo().asString("JUSTIFICATIVA");
   }

   public void setJustificativa(String justificativa) {
        markAsChanged("JUSTIFICATIVA", justificativa);
   }

   public String getNomeParcDest() {
        return this.getVo().asString("NOMEPARCDEST");
   }

   public void setNomeParcDest(String nomeParcDest) {
        markAsChanged("NOMEPARCDEST", nomeParcDest);
   }

   public String getNomeParcEmit() {
        return this.getVo().asString("NOMEPARCEMIT");
   }

   public void setNomeParcEmit(String nomeParcEmit) {
        markAsChanged("NOMEPARCEMIT", nomeParcEmit);
   }

   public String getNomeParcRec() {
        return this.getVo().asString("NOMEPARCREC");
   }

   public void setNomeParcRec(String nomeParcRec) {
        markAsChanged("NOMEPARCREC", nomeParcRec);
   }

   public String getNomeParcTransp() {
        return this.getVo().asString("NOMEPARCTRANSP");
   }

   public void setNomeParcTransp(String nomeParcTransp) {
        markAsChanged("NOMEPARCTRANSP", nomeParcTransp);
   }

   public String getNsu() {
        return this.getVo().asString("NSU");
   }

   public void setNsu(String nsu) {
        markAsChanged("NSU", nsu);
   }

   public String getNumProtoc() {
        return this.getVo().asString("NUMPROTOC");
   }

   public void setNumProtoc(String numProtoc) {
        markAsChanged("NUMPROTOC", numProtoc);
   }

   public BigDecimal getSeqEvento() {
        return this.getVo().asBigDecimal("SEQEVENTO");
   }

   public void setSeqEvento(BigDecimal seqEvento) {
        markAsChanged("SEQEVENTO", seqEvento);
   }

   public String getSituacaoCte() {
        return this.getVo().asString("SITUACAOCTE");
   }

   public void setSituacaoCte(String situacaoCte) {
        markAsChanged("SITUACAOCTE", situacaoCte);
   }

   public String getTpAmb() {
        return this.getVo().asString("TPAMB");
   }

   public void setTpAmb(String tpAmb) {
        markAsChanged("TPAMB", tpAmb);
   }

   public BigDecimal getTpDoc() {
        return this.getVo().asBigDecimal("TPDOC");
   }

   public void setTpDoc(BigDecimal tpDoc) {
        markAsChanged("TPDOC", tpDoc);
   }

   public BigDecimal getTpEvento() {
        return this.getVo().asBigDecimal("TPEVENTO");
   }

   public void setTpEvento(BigDecimal tpEvento) {
        markAsChanged("TPEVENTO", tpEvento);
   }

   public char[] getXmlEvento() {
        return this.getVo().asClob("XMLEVENTO");
   }

   public void setXmlEvento(char[] xmlEvento) {
        markAsChanged("XMLEVENTO", xmlEvento);
   }

   public String getMotivoNdDigital() {
        return this.getVo().asString("MOTIVONDDIGITAL");
   }

   public void setMotivoNdDigital(String motivoNdDigital) {
        markAsChanged("MOTIVONDDIGITAL", motivoNdDigital);
   }

   public String getStatus() {
        return this.getVo().asString("STATUS");
   }

   public void setStatus(String status) {
        markAsChanged("STATUS", status);
   }

   public String getSituacaoNfe() {
        return this.getVo().asString("SITUACAONFE");
   }

   public void setSituacaoNfe(String situacaoNfe) {
        markAsChanged("SITUACAONFE", situacaoNfe);
   }

   public Timestamp getDhAlter() {
        return this.getVo().asTimestamp("DHALTER");
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public String getSituacaoMde() {
        return this.getVo().asString("SITUACAOMDE");
   }

   public void setSituacaoMde(String situacaoMde) {
        markAsChanged("SITUACAOMDE", situacaoMde);
   }

   public String getChaveAcesso() {
        return this.getVo().asString("CHAVEACESSO");
   }

   public void setChaveAcesso(String chaveAcesso) {
        markAsChanged("CHAVEACESSO", chaveAcesso);
   }

   @Override
   public String getTableName() {
        return "TGFMDELOG";
   }

   @Override
   public String getEntityName() {
        return "LogRegistrosMDe";
   }

   @Override
   public LogRegistrosMDe fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
