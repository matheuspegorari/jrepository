package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class TempoAtividadePA extends AbstractSankhyaEntity<TempoAtividadePA> {
   public BigDecimal getIdeFx() {
        return this.getVo().asBigDecimal("IDEFX");
   }

   public void setIdeFx(BigDecimal ideFx) {
        markAsChanged("IDEFX", ideFx);
   }

   public String getControlePa() {
        return this.getVo().asString("CONTROLEPA");
   }

   public void setControlePa(String controlePa) {
        markAsChanged("CONTROLEPA", controlePa);
   }

   public BigDecimal getCodProdPa() {
        return this.getVo().asBigDecimal("CODPRODPA");
   }

   public void setCodProdPa(BigDecimal codProdPa) {
        markAsChanged("CODPRODPA", codProdPa);
   }

   public String getTipoTempo() {
        return this.getVo().asString("TIPOTEMPO");
   }

   public void setTipoTempo(String tipoTempo) {
        markAsChanged("TIPOTEMPO", tipoTempo);
   }

   public String getUnTempo() {
        return this.getVo().asString("UNTEMPO");
   }

   public void setUnTempo(String unTempo) {
        markAsChanged("UNTEMPO", unTempo);
   }

   public BigDecimal getTempoAtividade() {
        return this.getVo().asBigDecimal("TEMPOATIVIDADE");
   }

   public void setTempoAtividade(BigDecimal tempoAtividade) {
        markAsChanged("TEMPOATIVIDADE", tempoAtividade);
   }

   public BigDecimal getCodCwc() {
        return this.getVo().asBigDecimal("CODCWC");
   }

   public void setCodCwc(BigDecimal codCwc) {
        markAsChanged("CODCWC", codCwc);
   }

   public BigDecimal getCodWcp() {
        return this.getVo().asBigDecimal("CODWCP");
   }

   public void setCodWcp(BigDecimal codWcp) {
        markAsChanged("CODWCP", codWcp);
   }

   public BigDecimal getCodUsuAlt() {
        return this.getVo().asBigDecimal("CODUSUALT");
   }

   public void setCodUsuAlt(BigDecimal codUsuAlt) {
        markAsChanged("CODUSUALT", codUsuAlt);
   }

   public BigDecimal getCodUsuCad() {
        return this.getVo().asBigDecimal("CODUSUCAD");
   }

   public void setCodUsuCad(BigDecimal codUsuCad) {
        markAsChanged("CODUSUCAD", codUsuCad);
   }

   public Timestamp getDhAlter() {
        return this.getVo().asTimestamp("DHALTER");
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
   }

   public Timestamp getDhCad() {
        return this.getVo().asTimestamp("DHCAD");
   }

   public void setDhCad(Timestamp dhCad) {
        markAsChanged("DHCAD", dhCad);
   }

   public String getUsarCtPadrao() {
        return this.getVo().asString("USARCTPADRAO");
   }

   public void setUsarCtPadrao(String usarCtPadrao) {
        markAsChanged("USARCTPADRAO", usarCtPadrao);
   }

   @Override
   public String getTableName() {
        return "TPRTXP";
   }

   @Override
   public String getEntityName() {
        return "TempoAtividadePA";
   }

   @Override
   public TempoAtividadePA fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
