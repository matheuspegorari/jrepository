package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ApontamentoExecucaoTarefa extends AbstractSankhyaEntity<ApontamentoExecucaoTarefa> {
   private BigDecimal codUsu;
   private Timestamp dhFinal;
   private Timestamp dhInicial;
   private BigDecimal idInstPrn;
   private BigDecimal idInstTar;
   private BigDecimal sequencia;
   private BigDecimal tempo;
   private BigDecimal codUsuAlter;
   private Timestamp dhAlter;
   private BigDecimal intervalo;

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public Timestamp getDhFinal() {
        return dhFinal;
   }

   public void setDhFinal(Timestamp dhFinal) {
        markAsChanged("DHFINAL", dhFinal);
        this.dhFinal = dhFinal;
   }

   public Timestamp getDhInicial() {
        return dhInicial;
   }

   public void setDhInicial(Timestamp dhInicial) {
        markAsChanged("DHINICIAL", dhInicial);
        this.dhInicial = dhInicial;
   }

   public BigDecimal getIdInstPrn() {
        return idInstPrn;
   }

   public void setIdInstPrn(BigDecimal idInstPrn) {
        markAsChanged("IDINSTPRN", idInstPrn);
        this.idInstPrn = idInstPrn;
   }

   public BigDecimal getIdInstTar() {
        return idInstTar;
   }

   public void setIdInstTar(BigDecimal idInstTar) {
        markAsChanged("IDINSTTAR", idInstTar);
        this.idInstTar = idInstTar;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
        this.sequencia = sequencia;
   }

   public BigDecimal getTempo() {
        return tempo;
   }

   public void setTempo(BigDecimal tempo) {
        markAsChanged("TEMPO", tempo);
        this.tempo = tempo;
   }

   public BigDecimal getCodUsuAlter() {
        return codUsuAlter;
   }

   public void setCodUsuAlter(BigDecimal codUsuAlter) {
        markAsChanged("CODUSUALTER", codUsuAlter);
        this.codUsuAlter = codUsuAlter;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
        this.dhAlter = dhAlter;
   }

   public BigDecimal getIntervalo() {
        return intervalo;
   }

   public void setIntervalo(BigDecimal intervalo) {
        markAsChanged("INTERVALO", intervalo);
        this.intervalo = intervalo;
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
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.dhFinal = vo.asTimestamp("DHFINAL");
        this.dhInicial = vo.asTimestamp("DHINICIAL");
        this.idInstPrn = vo.asBigDecimal("IDINSTPRN");
        this.idInstTar = vo.asBigDecimal("IDINSTTAR");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.tempo = vo.asBigDecimal("TEMPO");
        this.codUsuAlter = vo.asBigDecimal("CODUSUALTER");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.intervalo = vo.asBigDecimal("INTERVALO");
        return this;
   }
}
