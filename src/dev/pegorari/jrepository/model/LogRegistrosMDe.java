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
        this.codEmp = codEmp;
   }

   public String getDescRevento() {
        return descRevento;
   }

   public void setDescRevento(String descRevento) {
        this.descRevento = descRevento;
   }

   public Timestamp getDhEvento() {
        return dhEvento;
   }

   public void setDhEvento(Timestamp dhEvento) {
        this.dhEvento = dhEvento;
   }

   public String getEmisSterc() {
        return emisSterc;
   }

   public void setEmisSterc(String emisSterc) {
        this.emisSterc = emisSterc;
   }

   public String getInfCompl() {
        return infCompl;
   }

   public void setInfCompl(String infCompl) {
        this.infCompl = infCompl;
   }

   public String getJustificativa() {
        return justificativa;
   }

   public void setJustificativa(String justificativa) {
        this.justificativa = justificativa;
   }

   public String getNomeParcDest() {
        return nomeParcDest;
   }

   public void setNomeParcDest(String nomeParcDest) {
        this.nomeParcDest = nomeParcDest;
   }

   public String getNomeParcEmit() {
        return nomeParcEmit;
   }

   public void setNomeParcEmit(String nomeParcEmit) {
        this.nomeParcEmit = nomeParcEmit;
   }

   public String getNomeParcRec() {
        return nomeParcRec;
   }

   public void setNomeParcRec(String nomeParcRec) {
        this.nomeParcRec = nomeParcRec;
   }

   public String getNomeParcTransp() {
        return nomeParcTransp;
   }

   public void setNomeParcTransp(String nomeParcTransp) {
        this.nomeParcTransp = nomeParcTransp;
   }

   public String getNsu() {
        return nsu;
   }

   public void setNsu(String nsu) {
        this.nsu = nsu;
   }

   public String getNumProtoc() {
        return numProtoc;
   }

   public void setNumProtoc(String numProtoc) {
        this.numProtoc = numProtoc;
   }

   public BigDecimal getSeqEvento() {
        return seqEvento;
   }

   public void setSeqEvento(BigDecimal seqEvento) {
        this.seqEvento = seqEvento;
   }

   public String getSituacaoCte() {
        return situacaoCte;
   }

   public void setSituacaoCte(String situacaoCte) {
        this.situacaoCte = situacaoCte;
   }

   public String getTpAmb() {
        return tpAmb;
   }

   public void setTpAmb(String tpAmb) {
        this.tpAmb = tpAmb;
   }

   public BigDecimal getTpDoc() {
        return tpDoc;
   }

   public void setTpDoc(BigDecimal tpDoc) {
        this.tpDoc = tpDoc;
   }

   public BigDecimal getTpEvento() {
        return tpEvento;
   }

   public void setTpEvento(BigDecimal tpEvento) {
        this.tpEvento = tpEvento;
   }

   public char[] getXmlEvento() {
        return xmlEvento;
   }

   public void setXmlEvento(char[] xmlEvento) {
        this.xmlEvento = xmlEvento;
   }

   public String getMotivoNdDigital() {
        return motivoNdDigital;
   }

   public void setMotivoNdDigital(String motivoNdDigital) {
        this.motivoNdDigital = motivoNdDigital;
   }

   public String getStatus() {
        return status;
   }

   public void setStatus(String status) {
        this.status = status;
   }

   public String getSituacaoNfe() {
        return situacaoNfe;
   }

   public void setSituacaoNfe(String situacaoNfe) {
        this.situacaoNfe = situacaoNfe;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        this.dhAlter = dhAlter;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        this.sequencia = sequencia;
   }

   public String getSituacaoMde() {
        return situacaoMde;
   }

   public void setSituacaoMde(String situacaoMde) {
        this.situacaoMde = situacaoMde;
   }

   public String getChaveAcesso() {
        return chaveAcesso;
   }

   public void setChaveAcesso(String chaveAcesso) {
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
