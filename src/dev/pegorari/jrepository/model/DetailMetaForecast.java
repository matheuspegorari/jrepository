package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class DetailMetaForecast extends AbstractSankhyaEntity<DetailMetaForecast> {
   private BigDecimal codCenario;
   private BigDecimal codMeta;
   private BigDecimal codUsu;
   private Timestamp dtRef;
   private BigDecimal previsto;
   private String recDesp;
   private String valueDetail;

   public BigDecimal getCodCenario() {
        return codCenario;
   }

   public void setCodCenario(BigDecimal codCenario) {
        this.codCenario = codCenario;
   }

   public BigDecimal getCodMeta() {
        return codMeta;
   }

   public void setCodMeta(BigDecimal codMeta) {
        this.codMeta = codMeta;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public Timestamp getDtRef() {
        return dtRef;
   }

   public void setDtRef(Timestamp dtRef) {
        this.dtRef = dtRef;
   }

   public BigDecimal getPrevisto() {
        return previsto;
   }

   public void setPrevisto(BigDecimal previsto) {
        this.previsto = previsto;
   }

   public String getRecDesp() {
        return recDesp;
   }

   public void setRecDesp(String recDesp) {
        this.recDesp = recDesp;
   }

   public String getValueDetail() {
        return valueDetail;
   }

   public void setValueDetail(String valueDetail) {
        this.valueDetail = valueDetail;
   }

   @Override
   public String getTableName() {
        return "TGMDFM";
   }

   @Override
   public String getEntityName() {
        return "DetailMetaForecast";
   }

   @Override
   public DetailMetaForecast fromVO(DynamicVO vo) {
        this.codCenario = vo.asBigDecimal("CODCENARIO");
        this.codMeta = vo.asBigDecimal("CODMETA");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.dtRef = vo.asTimestamp("DTREF");
        this.previsto = vo.asBigDecimal("PREVISTO");
        this.recDesp = vo.asString("RECDESP");
        this.valueDetail = vo.asString("VALUEDETAIL");
        return this;
   }
}
