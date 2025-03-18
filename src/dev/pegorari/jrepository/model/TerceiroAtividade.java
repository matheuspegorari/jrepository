package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class TerceiroAtividade extends AbstractSankhyaEntity<TerceiroAtividade> {
   private BigDecimal idIproc;
   private BigDecimal ideFx;
   private BigDecimal codParcterc;
   private BigDecimal codUsu;
   private Timestamp dtAlter;

   public BigDecimal getIdIproc() {
        return idIproc;
   }

   public void setIdIproc(BigDecimal idIproc) {
        markAsChanged("IDIPROC", idIproc);
        this.idIproc = idIproc;
   }

   public BigDecimal getIdeFx() {
        return ideFx;
   }

   public void setIdeFx(BigDecimal ideFx) {
        markAsChanged("IDEFX", ideFx);
        this.ideFx = ideFx;
   }

   public BigDecimal getCodParcterc() {
        return codParcterc;
   }

   public void setCodParcterc(BigDecimal codParcterc) {
        markAsChanged("CODPARCTERC", codParcterc);
        this.codParcterc = codParcterc;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
        this.dtAlter = dtAlter;
   }

   @Override
   public String getTableName() {
        return "TPRTXAT";
   }

   @Override
   public String getEntityName() {
        return "TerceiroAtividade";
   }

   @Override
   public TerceiroAtividade fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.idIproc = vo.asBigDecimal("IDIPROC");
        this.ideFx = vo.asBigDecimal("IDEFX");
        this.codParcterc = vo.asBigDecimal("CODPARCTERC");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.dtAlter = vo.asTimestamp("DTALTER");
        return this;
   }
}
