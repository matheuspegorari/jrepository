package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class HistoricoWorkCenterAtividade extends AbstractSankhyaEntity<HistoricoWorkCenterAtividade> {
   public BigDecimal getIdIproc() {
        return this.getVo().asBigDecimal("IDIPROC");
   }

   public void setIdIproc(BigDecimal idIproc) {
        markAsChanged("IDIPROC", idIproc);
   }

   public Timestamp getDhaloc() {
        return this.getVo().asTimestamp("DHALOC");
   }

   public void setDhaloc(Timestamp dhaloc) {
        markAsChanged("DHALOC", dhaloc);
   }

   public BigDecimal getIdiAtv() {
        return this.getVo().asBigDecimal("IDIATV");
   }

   public void setIdiAtv(BigDecimal idiAtv) {
        markAsChanged("IDIATV", idiAtv);
   }

   public BigDecimal getCodUsuLibAloc() {
        return this.getVo().asBigDecimal("CODUSULIBALOC");
   }

   public void setCodUsuLibAloc(BigDecimal codUsuLibAloc) {
        markAsChanged("CODUSULIBALOC", codUsuLibAloc);
   }

   public BigDecimal getCodUsuAloc() {
        return this.getVo().asBigDecimal("CODUSUALOC");
   }

   public void setCodUsuAloc(BigDecimal codUsuAloc) {
        markAsChanged("CODUSUALOC", codUsuAloc);
   }

   public Timestamp getDhLibAloc() {
        return this.getVo().asTimestamp("DHLIBALOC");
   }

   public void setDhLibAloc(Timestamp dhLibAloc) {
        markAsChanged("DHLIBALOC", dhLibAloc);
   }

   public BigDecimal getCodWcp() {
        return this.getVo().asBigDecimal("CODWCP");
   }

   public void setCodWcp(BigDecimal codWcp) {
        markAsChanged("CODWCP", codWcp);
   }

   public String getDescrAtv() {
        return this.getVo().asString("DESCRATV");
   }

   public void setDescrAtv(String descrAtv) {
        markAsChanged("DESCRATV", descrAtv);
   }

   @Override
   public String getTableName() {
        return "TPRHWXA";
   }

   @Override
   public String getEntityName() {
        return "HistoricoWorkCenterAtividade";
   }

   @Override
   public HistoricoWorkCenterAtividade fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
