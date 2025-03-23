package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ManutencaoProgramada extends AbstractSankhyaEntity<ManutencaoProgramada> {
   private BigDecimal codUsu;
   private Timestamp dhParada;
   private BigDecimal hrIndisp;
   private String msgMp;
   private BigDecimal numPa;

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public Timestamp getDhParada() {
        return dhParada;
   }

   public void setDhParada(Timestamp dhParada) {
        markAsChanged("DHPARADA", dhParada);
        this.dhParada = dhParada;
   }

   public BigDecimal getHrIndisp() {
        return hrIndisp;
   }

   public void setHrIndisp(BigDecimal hrIndisp) {
        markAsChanged("HRINDISP", hrIndisp);
        this.hrIndisp = hrIndisp;
   }

   public String getMsgMp() {
        return msgMp;
   }

   public void setMsgMp(String msgMp) {
        markAsChanged("MSGMP", msgMp);
        this.msgMp = msgMp;
   }

   public BigDecimal getNumPa() {
        return numPa;
   }

   public void setNumPa(BigDecimal numPa) {
        markAsChanged("NUMPA", numPa);
        this.numPa = numPa;
   }

   @Override
   public String getTableName() {
        return "TSIMPA";
   }

   @Override
   public String getEntityName() {
        return "ManutencaoProgramada";
   }

   @Override
   public ManutencaoProgramada fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.dhParada = vo.asTimestamp("DHPARADA");
        this.hrIndisp = vo.asBigDecimal("HRINDISP");
        this.msgMp = vo.asString("MSGMP");
        this.numPa = vo.asBigDecimal("NUMPA");
        return this;
   }
}
