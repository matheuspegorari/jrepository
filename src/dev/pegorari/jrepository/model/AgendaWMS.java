package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class AgendaWMS extends AbstractSankhyaEntity<AgendaWMS> {
   public BigDecimal getCodDoca() {
        return this.getVo().asBigDecimal("CODDOCA");
   }

   public void setCodDoca(BigDecimal codDoca) {
        markAsChanged("CODDOCA", codDoca);
   }

   public BigDecimal getCodParctransp() {
        return this.getVo().asBigDecimal("CODPARCTRANSP");
   }

   public void setCodParctransp(BigDecimal codParctransp) {
        markAsChanged("CODPARCTRANSP", codParctransp);
   }

   public Timestamp getDhEntrada() {
        return this.getVo().asTimestamp("DHENTRADA");
   }

   public void setDhEntrada(Timestamp dhEntrada) {
        markAsChanged("DHENTRADA", dhEntrada);
   }

   public Timestamp getDhPrevista() {
        return this.getVo().asTimestamp("DHPREVISTA");
   }

   public void setDhPrevista(Timestamp dhPrevista) {
        markAsChanged("DHPREVISTA", dhPrevista);
   }

   public Timestamp getDhSaida() {
        return this.getVo().asTimestamp("DHSAIDA");
   }

   public void setDhSaida(Timestamp dhSaida) {
        markAsChanged("DHSAIDA", dhSaida);
   }

   public String getMotivo() {
        return this.getVo().asString("MOTIVO");
   }

   public void setMotivo(String motivo) {
        markAsChanged("MOTIVO", motivo);
   }

   public BigDecimal getNuAgenda() {
        return this.getVo().asBigDecimal("NUAGENDA");
   }

   public void setNuAgenda(BigDecimal nuAgenda) {
        markAsChanged("NUAGENDA", nuAgenda);
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
        return this;
   }
}
