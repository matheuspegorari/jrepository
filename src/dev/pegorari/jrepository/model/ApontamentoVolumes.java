package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ApontamentoVolumes extends AbstractSankhyaEntity<ApontamentoVolumes> {
   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public String getControle() {
        return this.getVo().asString("CONTROLE");
   }

   public void setControle(String controle) {
        markAsChanged("CONTROLE", controle);
   }

   public BigDecimal getId() {
        return this.getVo().asBigDecimal("ID");
   }

   public void setId(BigDecimal id) {
        markAsChanged("ID", id);
   }

   public BigDecimal getIdIatv() {
        return this.getVo().asBigDecimal("IDIATV");
   }

   public void setIdIatv(BigDecimal idIatv) {
        markAsChanged("IDIATV", idIatv);
   }

   public BigDecimal getIdIproc() {
        return this.getVo().asBigDecimal("IDIPROC");
   }

   public void setIdIproc(BigDecimal idIproc) {
        markAsChanged("IDIPROC", idIproc);
   }

   public String getNroLote() {
        return this.getVo().asString("NROLOTE");
   }

   public void setNroLote(String nroLote) {
        markAsChanged("NROLOTE", nroLote);
   }

   public BigDecimal getNuApo() {
        return this.getVo().asBigDecimal("NUAPO");
   }

   public void setNuApo(BigDecimal nuApo) {
        markAsChanged("NUAPO", nuApo);
   }

   public BigDecimal getPesoBruto() {
        return this.getVo().asBigDecimal("PESOBRUTO");
   }

   public void setPesoBruto(BigDecimal pesoBruto) {
        markAsChanged("PESOBRUTO", pesoBruto);
   }

   public BigDecimal getPesoLiq() {
        return this.getVo().asBigDecimal("PESOLIQ");
   }

   public void setPesoLiq(BigDecimal pesoLiq) {
        markAsChanged("PESOLIQ", pesoLiq);
   }

   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
   }

   @Override
   public String getTableName() {
        return "TPRAVO";
   }

   @Override
   public String getEntityName() {
        return "ApontamentoVolumes";
   }

   @Override
   public ApontamentoVolumes fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
