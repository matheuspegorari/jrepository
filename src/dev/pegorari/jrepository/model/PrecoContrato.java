package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class PrecoContrato implements SankhyaEntity<PrecoContrato> {

   private BigDecimal codProd;
   private BigDecimal codServ;
   private BigDecimal numContrato;
   private Timestamp referencia;
   private BigDecimal valor;
   private BigDecimal codTerRespar;

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        this.codProd = codProd;
   }

   public BigDecimal getCodServ() {
        return codServ;
   }

   public void setCodServ(BigDecimal codServ) {
        this.codServ = codServ;
   }

   public BigDecimal getNumContrato() {
        return numContrato;
   }

   public void setNumContrato(BigDecimal numContrato) {
        this.numContrato = numContrato;
   }

   public Timestamp getReferencia() {
        return referencia;
   }

   public void setReferencia(Timestamp referencia) {
        this.referencia = referencia;
   }

   public BigDecimal getValor() {
        return valor;
   }

   public void setValor(BigDecimal valor) {
        this.valor = valor;
   }

   public BigDecimal getCodTerRespar() {
        return codTerRespar;
   }

   public void setCodTerRespar(BigDecimal codTerRespar) {
        this.codTerRespar = codTerRespar;
   }

   @Override
   public String getEntityName() {
        return "PrecoContrato";
   }

   @Override
   public PrecoContrato fromVO(DynamicVO vo) {
        this.codProd = vo.asBigDecimal("CODPROD");
        this.codServ = vo.asBigDecimal("CODSERV");
        this.numContrato = vo.asBigDecimal("NUMCONTRATO");
        this.referencia = vo.asTimestamp("REFERENCIA");
        this.valor = vo.asBigDecimal("VALOR");
        this.codTerRespar = vo.asBigDecimal("CODTERRESPAR");
        return this;
   }
}
