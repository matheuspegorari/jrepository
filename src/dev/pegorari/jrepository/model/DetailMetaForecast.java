package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class DetailMetaForecast extends AbstractSankhyaEntity<DetailMetaForecast> {
   public BigDecimal getCodCenario() {
        return this.getVo().asBigDecimal("CODCENARIO");
   }

   public void setCodCenario(BigDecimal codCenario) {
        markAsChanged("CODCENARIO", codCenario);
   }

   public BigDecimal getCodMeta() {
        return this.getVo().asBigDecimal("CODMETA");
   }

   public void setCodMeta(BigDecimal codMeta) {
        markAsChanged("CODMETA", codMeta);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public Timestamp getDtRef() {
        return this.getVo().asTimestamp("DTREF");
   }

   public void setDtRef(Timestamp dtRef) {
        markAsChanged("DTREF", dtRef);
   }

   public BigDecimal getPrevisto() {
        return this.getVo().asBigDecimal("PREVISTO");
   }

   public void setPrevisto(BigDecimal previsto) {
        markAsChanged("PREVISTO", previsto);
   }

   public String getRecDesp() {
        return this.getVo().asString("RECDESP");
   }

   public void setRecDesp(String recDesp) {
        markAsChanged("RECDESP", recDesp);
   }

   public String getValueDetail() {
        return this.getVo().asString("VALUEDETAIL");
   }

   public void setValueDetail(String valueDetail) {
        markAsChanged("VALUEDETAIL", valueDetail);
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
        this.setVo(vo);
        return this;
   }
}
