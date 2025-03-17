package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class DevolucaoWMS implements SankhyaEntity<DevolucaoWMS> {

   private BigDecimal sequencia;
   private BigDecimal qtdDevolver;
   private BigDecimal nuNota;
   private BigDecimal nuDev;
   private BigDecimal codUsu;
   private BigDecimal nuConferencia;
   private Timestamp dhDev;

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        this.sequencia = sequencia;
   }

   public BigDecimal getQtdDevolver() {
        return qtdDevolver;
   }

   public void setQtdDevolver(BigDecimal qtdDevolver) {
        this.qtdDevolver = qtdDevolver;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        this.nuNota = nuNota;
   }

   public BigDecimal getNuDev() {
        return nuDev;
   }

   public void setNuDev(BigDecimal nuDev) {
        this.nuDev = nuDev;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public BigDecimal getNuConferencia() {
        return nuConferencia;
   }

   public void setNuConferencia(BigDecimal nuConferencia) {
        this.nuConferencia = nuConferencia;
   }

   public Timestamp getDhDev() {
        return dhDev;
   }

   public void setDhDev(Timestamp dhDev) {
        this.dhDev = dhDev;
   }

   @Override
   public String getEntityName() {
        return "DevolucaoWMS";
   }

   @Override
   public DevolucaoWMS fromVO(DynamicVO vo) {
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.qtdDevolver = vo.asBigDecimal("QTDDEVOLVER");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.nuDev = vo.asBigDecimal("NUDEV");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.nuConferencia = vo.asBigDecimal("NUCONFERENCIA");
        this.dhDev = vo.asTimestamp("DHDEV");
        return this;
   }
}
