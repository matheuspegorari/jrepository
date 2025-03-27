package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ManutencaoProgramada extends AbstractSankhyaEntity<ManutencaoProgramada> {
   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public Timestamp getDhParada() {
        return this.getVo().asTimestamp("DHPARADA");
   }

   public void setDhParada(Timestamp dhParada) {
        markAsChanged("DHPARADA", dhParada);
   }

   public BigDecimal getHrIndisp() {
        return this.getVo().asBigDecimal("HRINDISP");
   }

   public void setHrIndisp(BigDecimal hrIndisp) {
        markAsChanged("HRINDISP", hrIndisp);
   }

   public String getMsgMp() {
        return this.getVo().asString("MSGMP");
   }

   public void setMsgMp(String msgMp) {
        markAsChanged("MSGMP", msgMp);
   }

   public BigDecimal getNumPa() {
        return this.getVo().asBigDecimal("NUMPA");
   }

   public void setNumPa(BigDecimal numPa) {
        markAsChanged("NUMPA", numPa);
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
        return this;
   }
}
