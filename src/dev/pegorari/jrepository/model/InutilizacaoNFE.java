package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class InutilizacaoNFE extends AbstractSankhyaEntity<InutilizacaoNFE> {
   private BigDecimal codEmp;
   private BigDecimal codModDoc;
   private BigDecimal codUsu;
   private Timestamp dhProtoc;
   private Timestamp dtMov;
   private String motivo;
   private BigDecimal numNota;
   private String numProtoc;
   private String serieNota;
   private String entSai;
   private String tpAmbNfe;

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public BigDecimal getCodModDoc() {
        return codModDoc;
   }

   public void setCodModDoc(BigDecimal codModDoc) {
        markAsChanged("CODMODDOC", codModDoc);
        this.codModDoc = codModDoc;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public Timestamp getDhProtoc() {
        return dhProtoc;
   }

   public void setDhProtoc(Timestamp dhProtoc) {
        markAsChanged("DHPROTOC", dhProtoc);
        this.dhProtoc = dhProtoc;
   }

   public Timestamp getDtMov() {
        return dtMov;
   }

   public void setDtMov(Timestamp dtMov) {
        markAsChanged("DTMOV", dtMov);
        this.dtMov = dtMov;
   }

   public String getMotivo() {
        return motivo;
   }

   public void setMotivo(String motivo) {
        markAsChanged("MOTIVO", motivo);
        this.motivo = motivo;
   }

   public BigDecimal getNumNota() {
        return numNota;
   }

   public void setNumNota(BigDecimal numNota) {
        markAsChanged("NUMNOTA", numNota);
        this.numNota = numNota;
   }

   public String getNumProtoc() {
        return numProtoc;
   }

   public void setNumProtoc(String numProtoc) {
        markAsChanged("NUMPROTOC", numProtoc);
        this.numProtoc = numProtoc;
   }

   public String getSerieNota() {
        return serieNota;
   }

   public void setSerieNota(String serieNota) {
        markAsChanged("SERIENOTA", serieNota);
        this.serieNota = serieNota;
   }

   public String getEntSai() {
        return entSai;
   }

   public void setEntSai(String entSai) {
        markAsChanged("ENTSAI", entSai);
        this.entSai = entSai;
   }

   public String getTpAmbNfe() {
        return tpAmbNfe;
   }

   public void setTpAmbNfe(String tpAmbNfe) {
        markAsChanged("TPAMBNFE", tpAmbNfe);
        this.tpAmbNfe = tpAmbNfe;
   }

   @Override
   public String getTableName() {
        return "TGFINU";
   }

   @Override
   public String getEntityName() {
        return "InutilizacaoNFE";
   }

   @Override
   public InutilizacaoNFE fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codModDoc = vo.asBigDecimal("CODMODDOC");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.dhProtoc = vo.asTimestamp("DHPROTOC");
        this.dtMov = vo.asTimestamp("DTMOV");
        this.motivo = vo.asString("MOTIVO");
        this.numNota = vo.asBigDecimal("NUMNOTA");
        this.numProtoc = vo.asString("NUMPROTOC");
        this.serieNota = vo.asString("SERIENOTA");
        this.entSai = vo.asString("ENTSAI");
        this.tpAmbNfe = vo.asString("TPAMBNFE");
        return this;
   }
}
