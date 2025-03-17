package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class TerceiroAtividade implements SankhyaEntity<TerceiroAtividade> {

   private BigDecimal idIproc;
   private BigDecimal idEfx;
   private BigDecimal codParcterc;
   private BigDecimal codUsu;
   private Timestamp dtAlter;

   public BigDecimal getIdIproc() {
        return idIproc;
   }

   public void setIdIproc(BigDecimal idIproc) {
        this.idIproc = idIproc;
   }

   public BigDecimal getIdEfx() {
        return idEfx;
   }

   public void setIdEfx(BigDecimal idEfx) {
        this.idEfx = idEfx;
   }

   public BigDecimal getCodParcterc() {
        return codParcterc;
   }

   public void setCodParcterc(BigDecimal codParcterc) {
        this.codParcterc = codParcterc;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        this.dtAlter = dtAlter;
   }

   @Override
   public String getEntityName() {
        return "TerceiroAtividade";
   }

   @Override
   public TerceiroAtividade fromVO(DynamicVO vo) {
        this.idIproc = vo.asBigDecimal("IDIPROC");
        this.idEfx = vo.asBigDecimal("IDEFX");
        this.codParcterc = vo.asBigDecimal("CODPARCTERC");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.dtAlter = vo.asTimestamp("DTALTER");
        return this;
   }
}
