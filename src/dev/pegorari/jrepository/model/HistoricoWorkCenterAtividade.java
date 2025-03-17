package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class HistoricoWorkCenterAtividade implements SankhyaEntity<HistoricoWorkCenterAtividade> {

   private BigDecimal idProc;
   private Timestamp dhAloc;
   private BigDecimal idAtv;
   private BigDecimal codUsuLibAloc;
   private BigDecimal codUsuAloc;
   private Timestamp dhLibAloc;
   private BigDecimal codWcp;
   private String descrAtv;

   public BigDecimal getIdProc() {
        return idProc;
   }

   public void setIdProc(BigDecimal idProc) {
        this.idProc = idProc;
   }

   public Timestamp getDhAloc() {
        return dhAloc;
   }

   public void setDhAloc(Timestamp dhAloc) {
        this.dhAloc = dhAloc;
   }

   public BigDecimal getIdAtv() {
        return idAtv;
   }

   public void setIdAtv(BigDecimal idAtv) {
        this.idAtv = idAtv;
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
   public String getEntityName() {
        return "HistoricoWorkCenterAtividade";
   }

   @Override
   public HistoricoWorkCenterAtividade fromVO(DynamicVO vo) {
        this.idProc = vo.asBigDecimal("IDPROC");
        this.dhAloc = vo.asTimestamp("DHALOC");
        this.idAtv = vo.asBigDecimal("IDATV");
        this.codUsuLibAloc = vo.asBigDecimal("CODUSULIBALOC");
        this.codUsuAloc = vo.asBigDecimal("CODUSUALOC");
        this.dhLibAloc = vo.asTimestamp("DHLIBALOC");
        this.codWcp = vo.asBigDecimal("CODWCP");
        this.descrAtv = vo.asString("DESCRATV");
        return this;
   }
}
