package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class TerceiroAtividade extends AbstractSankhyaEntity<TerceiroAtividade> {
   public BigDecimal getIdIproc() {
        return this.getVo().asBigDecimal("IDIPROC");
   }

   public void setIdIproc(BigDecimal idIproc) {
        markAsChanged("IDIPROC", idIproc);
   }

   public BigDecimal getIdeFx() {
        return this.getVo().asBigDecimal("IDEFX");
   }

   public void setIdeFx(BigDecimal ideFx) {
        markAsChanged("IDEFX", ideFx);
   }

   public BigDecimal getCodParcterc() {
        return this.getVo().asBigDecimal("CODPARCTERC");
   }

   public void setCodParcterc(BigDecimal codParcterc) {
        markAsChanged("CODPARCTERC", codParcterc);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
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
        this.setVo(vo);
        return this;
   }
}
