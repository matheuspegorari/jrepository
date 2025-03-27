package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class PrecoContrato extends AbstractSankhyaEntity<PrecoContrato> {
   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public BigDecimal getCodServ() {
        return this.getVo().asBigDecimal("CODSERV");
   }

   public void setCodServ(BigDecimal codServ) {
        markAsChanged("CODSERV", codServ);
   }

   public BigDecimal getNumContrato() {
        return this.getVo().asBigDecimal("NUMCONTRATO");
   }

   public void setNumContrato(BigDecimal numContrato) {
        markAsChanged("NUMCONTRATO", numContrato);
   }

   public Timestamp getReferencia() {
        return this.getVo().asTimestamp("REFERENCIA");
   }

   public void setReferencia(Timestamp referencia) {
        markAsChanged("REFERENCIA", referencia);
   }

   public BigDecimal getValor() {
        return this.getVo().asBigDecimal("VALOR");
   }

   public void setValor(BigDecimal valor) {
        markAsChanged("VALOR", valor);
   }

   public BigDecimal getCodTerResPar() {
        return this.getVo().asBigDecimal("CODTERRESPAR");
   }

   public void setCodTerResPar(BigDecimal codTerResPar) {
        markAsChanged("CODTERRESPAR", codTerResPar);
   }

   @Override
   public String getTableName() {
        return "TCSPRE";
   }

   @Override
   public String getEntityName() {
        return "PrecoContrato";
   }

   @Override
   public PrecoContrato fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
