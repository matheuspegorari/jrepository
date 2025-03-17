package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class AgendaWMS implements SankhyaEntity<AgendaWMS> {

   private BigDecimal codDoca;
   private BigDecimal codParcTransp;
   private Timestamp dhEntrada;
   private Timestamp dhPrevista;
   private Timestamp dhSaida;
   private String motivo;
   private BigDecimal nuAgenda;

   public BigDecimal getCodDoca() {
        return codDoca;
   }

   public void setCodDoca(BigDecimal codDoca) {
        this.codDoca = codDoca;
   }

   public BigDecimal getCodParcTransp() {
        return codParcTransp;
   }

   public void setCodParcTransp(BigDecimal codParcTransp) {
        this.codParcTransp = codParcTransp;
   }

   public Timestamp getDhEntrada() {
        return dhEntrada;
   }

   public void setDhEntrada(Timestamp dhEntrada) {
        this.dhEntrada = dhEntrada;
   }

   public Timestamp getDhPrevista() {
        return dhPrevista;
   }

   public void setDhPrevista(Timestamp dhPrevista) {
        this.dhPrevista = dhPrevista;
   }

   public Timestamp getDhSaida() {
        return dhSaida;
   }

   public void setDhSaida(Timestamp dhSaida) {
        this.dhSaida = dhSaida;
   }

   public String getMotivo() {
        return motivo;
   }

   public void setMotivo(String motivo) {
        this.motivo = motivo;
   }

   public BigDecimal getNuAgenda() {
        return nuAgenda;
   }

   public void setNuAgenda(BigDecimal nuAgenda) {
        this.nuAgenda = nuAgenda;
   }

   @Override
   public String getEntityName() {
        return "AgendaWMS";
   }

   @Override
   public AgendaWMS fromVO(DynamicVO vo) {
        this.codDoca = vo.asBigDecimal("CODDOCA");
        this.codParcTransp = vo.asBigDecimal("CODPARCTRANSP");
        this.dhEntrada = vo.asTimestamp("DHENTRADA");
        this.dhPrevista = vo.asTimestamp("DHPREVISTA");
        this.dhSaida = vo.asTimestamp("DHSAIDA");
        this.motivo = vo.asString("MOTIVO");
        this.nuAgenda = vo.asBigDecimal("NUAGENDA");
        return this;
   }
}
