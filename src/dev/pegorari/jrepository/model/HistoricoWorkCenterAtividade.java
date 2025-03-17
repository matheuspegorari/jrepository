package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class HistoricoWorkCenterAtividade extends AbstractSankhyaEntity<HistoricoWorkCenterAtividade> {
   private BigDecimal idIproc;
   private Timestamp dhaloc;
   private BigDecimal idiAtv;
   private BigDecimal codUsuLibAloc;
   private BigDecimal codUsuAloc;
   private Timestamp dhLibAloc;
   private BigDecimal codWcp;
   private String descrAtv;

   public BigDecimal getIdIproc() {
        return idIproc;
   }

   public void setIdIproc(BigDecimal idIproc) {
        this.idIproc = idIproc;
   }

   public Timestamp getDhaloc() {
        return dhaloc;
   }

   public void setDhaloc(Timestamp dhaloc) {
        this.dhaloc = dhaloc;
   }

   public BigDecimal getIdiAtv() {
        return idiAtv;
   }

   public void setIdiAtv(BigDecimal idiAtv) {
        this.idiAtv = idiAtv;
   }

   public BigDecimal getCodUsuLibAloc() {
        return codUsuLibAloc;
   }

   public void setCodUsuLibAloc(BigDecimal codUsuLibAloc) {
        this.codUsuLibAloc = codUsuLibAloc;
   }

   public BigDecimal getCodUsuAloc() {
        return codUsuAloc;
   }

   public void setCodUsuAloc(BigDecimal codUsuAloc) {
        this.codUsuAloc = codUsuAloc;
   }

   public Timestamp getDhLibAloc() {
        return dhLibAloc;
   }

   public void setDhLibAloc(Timestamp dhLibAloc) {
        this.dhLibAloc = dhLibAloc;
   }

   public BigDecimal getCodWcp() {
        return codWcp;
   }

   public void setCodWcp(BigDecimal codWcp) {
        this.codWcp = codWcp;
   }

   public String getDescrAtv() {
        return descrAtv;
   }

   public void setDescrAtv(String descrAtv) {
        this.descrAtv = descrAtv;
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
        this.idIproc = vo.asBigDecimal("IDIPROC");
        this.dhaloc = vo.asTimestamp("DHALOC");
        this.idiAtv = vo.asBigDecimal("IDIATV");
        this.codUsuLibAloc = vo.asBigDecimal("CODUSULIBALOC");
        this.codUsuAloc = vo.asBigDecimal("CODUSUALOC");
        this.dhLibAloc = vo.asTimestamp("DHLIBALOC");
        this.codWcp = vo.asBigDecimal("CODWCP");
        this.descrAtv = vo.asString("DESCRATV");
        return this;
   }
}
