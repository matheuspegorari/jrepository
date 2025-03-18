package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class LogRegistrosMDe extends AbstractSankhyaEntity<LogRegistrosMDe> {
   private BigDecimal codEmp;
   private String descRevento;
   private Timestamp dhEvento;
   private String emisSterc;
   private String infCompl;
   private String justificativa;
   private String nomeParcDest;
   private String nomeParcEmit;
   private String nomeParcRec;
   private String nomeParcTransp;
   private String nsu;
   private String numProtoc;
   private BigDecimal seqEvento;
   private String situacaoCte;
   private String tpAmb;
   private BigDecimal tpDoc;
   private BigDecimal tpEvento;
   private char[] xmlEvento;
   private String motivoNdDigital;
   private String status;
   private String situacaoNfe;
   private Timestamp dhAlter;
   private BigDecimal codUsu;
   private BigDecimal sequencia;
   private String situacaoMde;
   private String chaveAcesso;

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public String getDescRevento() {
        return descRevento;
   }

   public void setDescRevento(String descRevento) {
        markAsChanged("DESCREVENTO", descRevento);
        this.descRevento = descRevento;
   }

   public Timestamp getDhEvento() {
        return dhEvento;
   }

   public void setDhEvento(Timestamp dhEvento) {
        markAsChanged("DHEVENTO", dhEvento);
        this.dhEvento = dhEvento;
   }

   public String getEmisSterc() {
        return emisSterc;
   }

   public void setEmisSterc(String emisSterc) {
        markAsChanged("EMISSTERC", emisSterc);
        this.emisSterc = emisSterc;
   }

   public String getInfCompl() {
        return infCompl;
   }

   public void setInfCompl(String infCompl) {
        markAsChanged("INFCOMPL", infCompl);
        this.infCompl = infCompl;
   }

   public String getJustificativa() {
        return justificativa;
   }

   public void setJustificativa(String justificativa) {
        markAsChanged("JUSTIFICATIVA", justificativa);
        this.justificativa = justificativa;
   }

   public String getNomeParcDest() {
        return nomeParcDest;
   }

   public void setNomeParcDest(String nomeParcDest) {
        markAsChanged("NOMEPARCDEST", nomeParcDest);
        this.nomeParcDest = nomeParcDest;
   }

   public String getNomeParcEmit() {
        return nomeParcEmit;
   }

   public void setNomeParcEmit(String nomeParcEmit) {
        markAsChanged("NOMEPARCEMIT", nomeParcEmit);
        this.nomeParcEmit = nomeParcEmit;
   }

   public String getNomeParcRec() {
        return nomeParcRec;
   }

   public void setNomeParcRec(String nomeParcRec) {
        markAsChanged("NOMEPARCREC", nomeParcRec);
        this.nomeParcRec = nomeParcRec;
   }

   public String getNomeParcTransp() {
        return nomeParcTransp;
   }

   public void setNomeParcTransp(String nomeParcTransp) {
        markAsChanged("NOMEPARCTRANSP", nomeParcTransp);
        this.nomeParcTransp = nomeParcTransp;
   }

   public String getNsu() {
        return nsu;
   }

   public void setNsu(String nsu) {
        markAsChanged("NSU", nsu);
        this.nsu = nsu;
   }

   public String getNumProtoc() {
        return numProtoc;
   }

   public void setNumProtoc(String numProtoc) {
        markAsChanged("NUMPROTOC", numProtoc);
        this.numProtoc = numProtoc;
   }

   public BigDecimal getSeqEvento() {
        return seqEvento;
   }

   public void setSeqEvento(BigDecimal seqEvento) {
        markAsChanged("SEQEVENTO", seqEvento);
        this.seqEvento = seqEvento;
   }

   public String getSituacaoCte() {
        return situacaoCte;
   }

   public void setSituacaoCte(String situacaoCte) {
        markAsChanged("SITUACAOCTE", situacaoCte);
        this.situacaoCte = situacaoCte;
   }

   public String getTpAmb() {
        return tpAmb;
   }

   public void setTpAmb(String tpAmb) {
        markAsChanged("TPAMB", tpAmb);
        this.tpAmb = tpAmb;
   }

   public BigDecimal getTpDoc() {
        return tpDoc;
   }

   public void setTpDoc(BigDecimal tpDoc) {
        markAsChanged("TPDOC", tpDoc);
        this.tpDoc = tpDoc;
   }

   public BigDecimal getTpEvento() {
        return tpEvento;
   }

   public void setTpEvento(BigDecimal tpEvento) {
        markAsChanged("TPEVENTO", tpEvento);
        this.tpEvento = tpEvento;
   }

   public char[] getXmlEvento() {
        return xmlEvento;
   }

   public void setXmlEvento(char[] xmlEvento) {
        markAsChanged("XMLEVENTO", xmlEvento);
        this.xmlEvento = xmlEvento;
   }

   public String getMotivoNdDigital() {
        return motivoNdDigital;
   }

   public void setMotivoNdDigital(String motivoNdDigital) {
        markAsChanged("MOTIVONDDIGITAL", motivoNdDigital);
        this.motivoNdDigital = motivoNdDigital;
   }

   public String getStatus() {
        return status;
   }

   public void setStatus(String status) {
        markAsChanged("STATUS", status);
        this.status = status;
   }

   public String getSituacaoNfe() {
        return situacaoNfe;
   }

   public void setSituacaoNfe(String situacaoNfe) {
        markAsChanged("SITUACAONFE", situacaoNfe);
        this.situacaoNfe = situacaoNfe;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
        this.dhAlter = dhAlter;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
        this.sequencia = sequencia;
   }

   public String getSituacaoMde() {
        return situacaoMde;
   }

   public void setSituacaoMde(String situacaoMde) {
        markAsChanged("SITUACAOMDE", situacaoMde);
        this.situacaoMde = situacaoMde;
   }

   public String getChaveAcesso() {
        return chaveAcesso;
   }

   public void setChaveAcesso(String chaveAcesso) {
        markAsChanged("CHAVEACESSO", chaveAcesso);
        this.chaveAcesso = chaveAcesso;
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
        this.setOriginalVO(vo);
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.descRevento = vo.asString("DESCREVENTO");
        this.dhEvento = vo.asTimestamp("DHEVENTO");
        this.emisSterc = vo.asString("EMISSTERC");
        this.infCompl = vo.asString("INFCOMPL");
        this.justificativa = vo.asString("JUSTIFICATIVA");
        this.nomeParcDest = vo.asString("NOMEPARCDEST");
        this.nomeParcEmit = vo.asString("NOMEPARCEMIT");
        this.nomeParcRec = vo.asString("NOMEPARCREC");
        this.nomeParcTransp = vo.asString("NOMEPARCTRANSP");
        this.nsu = vo.asString("NSU");
        this.numProtoc = vo.asString("NUMPROTOC");
        this.seqEvento = vo.asBigDecimal("SEQEVENTO");
        this.situacaoCte = vo.asString("SITUACAOCTE");
        this.tpAmb = vo.asString("TPAMB");
        this.tpDoc = vo.asBigDecimal("TPDOC");
        this.tpEvento = vo.asBigDecimal("TPEVENTO");
        this.xmlEvento = vo.asClob("XMLEVENTO");
        this.motivoNdDigital = vo.asString("MOTIVONDDIGITAL");
        this.status = vo.asString("STATUS");
        this.situacaoNfe = vo.asString("SITUACAONFE");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.situacaoMde = vo.asString("SITUACAOMDE");
        this.chaveAcesso = vo.asString("CHAVEACESSO");
        return this;
   }
}
