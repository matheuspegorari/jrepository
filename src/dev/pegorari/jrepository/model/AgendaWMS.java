package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class AgendaWMS extends AbstractSankhyaEntity<AgendaWMS> {
   private BigDecimal codDoca;
   private BigDecimal codParctransp;
   private Timestamp dhEntrada;
   private Timestamp dhPrevista;
   private Timestamp dhSaida;
   private String motivo;
   private BigDecimal nuAgenda;

   public BigDecimal getCodDoca() {
        return codDoca;
   }

   public void setCodDoca(BigDecimal codDoca) {
        markAsChanged("CODDOCA", codDoca);
        this.codDoca = codDoca;
   }

   public BigDecimal getCodParctransp() {
        return codParctransp;
   }

   public void setCodParctransp(BigDecimal codParctransp) {
        markAsChanged("CODPARCTRANSP", codParctransp);
        this.codParctransp = codParctransp;
   }

   public Timestamp getDhEntrada() {
        return dhEntrada;
   }

   public void setDhEntrada(Timestamp dhEntrada) {
        markAsChanged("DHENTRADA", dhEntrada);
        this.dhEntrada = dhEntrada;
   }

   public Timestamp getDhPrevista() {
        return dhPrevista;
   }

   public void setDhPrevista(Timestamp dhPrevista) {
        markAsChanged("DHPREVISTA", dhPrevista);
        this.dhPrevista = dhPrevista;
   }

   public Timestamp getDhSaida() {
        return dhSaida;
   }

   public void setDhSaida(Timestamp dhSaida) {
        markAsChanged("DHSAIDA", dhSaida);
        this.dhSaida = dhSaida;
   }

   public String getMotivo() {
        return motivo;
   }

   public void setMotivo(String motivo) {
        markAsChanged("MOTIVO", motivo);
        this.motivo = motivo;
   }

   public BigDecimal getNuAgenda() {
        return nuAgenda;
   }

   public void setNuAgenda(BigDecimal nuAgenda) {
        markAsChanged("NUAGENDA", nuAgenda);
        this.nuAgenda = nuAgenda;
   }

   @Override
   public String getTableName() {
        return "TGWAGE";
   }

   @Override
   public String getEntityName() {
        return "AgendaWMS";
   }

   @Override
   public AgendaWMS fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.codDoca = vo.asBigDecimal("CODDOCA");
        this.codParctransp = vo.asBigDecimal("CODPARCTRANSP");
        this.dhEntrada = vo.asTimestamp("DHENTRADA");
        this.dhPrevista = vo.asTimestamp("DHPREVISTA");
        this.dhSaida = vo.asTimestamp("DHSAIDA");
        this.motivo = vo.asString("MOTIVO");
        this.nuAgenda = vo.asBigDecimal("NUAGENDA");
        return this;
   }
}
