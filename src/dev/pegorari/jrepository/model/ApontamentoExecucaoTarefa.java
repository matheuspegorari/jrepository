package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ApontamentoExecucaoTarefa extends AbstractSankhyaEntity<ApontamentoExecucaoTarefa> {
   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public Timestamp getDhFinal() {
        return this.getVo().asTimestamp("DHFINAL");
   }

   public void setDhFinal(Timestamp dhFinal) {
        markAsChanged("DHFINAL", dhFinal);
   }

   public Timestamp getDhInicial() {
        return this.getVo().asTimestamp("DHINICIAL");
   }

   public void setDhInicial(Timestamp dhInicial) {
        markAsChanged("DHINICIAL", dhInicial);
   }

   public BigDecimal getIdInstPrn() {
        return this.getVo().asBigDecimal("IDINSTPRN");
   }

   public void setIdInstPrn(BigDecimal idInstPrn) {
        markAsChanged("IDINSTPRN", idInstPrn);
   }

   public BigDecimal getIdInstTar() {
        return this.getVo().asBigDecimal("IDINSTTAR");
   }

   public void setIdInstTar(BigDecimal idInstTar) {
        markAsChanged("IDINSTTAR", idInstTar);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public BigDecimal getTempo() {
        return this.getVo().asBigDecimal("TEMPO");
   }

   public void setTempo(BigDecimal tempo) {
        markAsChanged("TEMPO", tempo);
   }

   public BigDecimal getCodUsuAlter() {
        return this.getVo().asBigDecimal("CODUSUALTER");
   }

   public void setCodUsuAlter(BigDecimal codUsuAlter) {
        markAsChanged("CODUSUALTER", codUsuAlter);
   }

   public Timestamp getDhAlter() {
        return this.getVo().asTimestamp("DHALTER");
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
   }

   public BigDecimal getIntervalo() {
        return this.getVo().asBigDecimal("INTERVALO");
   }

   public void setIntervalo(BigDecimal intervalo) {
        markAsChanged("INTERVALO", intervalo);
   }

   @Override
   public String getTableName() {
        return "TWFIEXE";
   }

   @Override
   public String getEntityName() {
        return "ApontamentoExecucaoTarefa";
   }

   @Override
   public ApontamentoExecucaoTarefa fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
