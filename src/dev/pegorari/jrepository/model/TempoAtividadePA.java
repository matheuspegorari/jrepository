package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class TempoAtividadePA extends AbstractSankhyaEntity<TempoAtividadePA> {
   private BigDecimal ideFx;
   private String controlePa;
   private BigDecimal codProdPa;
   private String tipoTempo;
   private String unTempo;
   private BigDecimal tempoAtividade;
   private BigDecimal codCwc;
   private BigDecimal codWcp;
   private BigDecimal codUsuAlt;
   private BigDecimal codUsuCad;
   private Timestamp dhAlter;
   private Timestamp dhCad;
   private String usarCtPadrao;

   public BigDecimal getIdeFx() {
        return ideFx;
   }

   public void setIdeFx(BigDecimal ideFx) {
        markAsChanged("IDEFX", ideFx);
        this.ideFx = ideFx;
   }

   public String getControlePa() {
        return controlePa;
   }

   public void setControlePa(String controlePa) {
        markAsChanged("CONTROLEPA", controlePa);
        this.controlePa = controlePa;
   }

   public BigDecimal getCodProdPa() {
        return codProdPa;
   }

   public void setCodProdPa(BigDecimal codProdPa) {
        markAsChanged("CODPRODPA", codProdPa);
        this.codProdPa = codProdPa;
   }

   public String getTipoTempo() {
        return tipoTempo;
   }

   public void setTipoTempo(String tipoTempo) {
        markAsChanged("TIPOTEMPO", tipoTempo);
        this.tipoTempo = tipoTempo;
   }

   public String getUnTempo() {
        return unTempo;
   }

   public void setUnTempo(String unTempo) {
        markAsChanged("UNTEMPO", unTempo);
        this.unTempo = unTempo;
   }

   public BigDecimal getTempoAtividade() {
        return tempoAtividade;
   }

   public void setTempoAtividade(BigDecimal tempoAtividade) {
        markAsChanged("TEMPOATIVIDADE", tempoAtividade);
        this.tempoAtividade = tempoAtividade;
   }

   public BigDecimal getCodCwc() {
        return codCwc;
   }

   public void setCodCwc(BigDecimal codCwc) {
        markAsChanged("CODCWC", codCwc);
        this.codCwc = codCwc;
   }

   public BigDecimal getCodWcp() {
        return codWcp;
   }

   public void setCodWcp(BigDecimal codWcp) {
        markAsChanged("CODWCP", codWcp);
        this.codWcp = codWcp;
   }

   public BigDecimal getCodUsuAlt() {
        return codUsuAlt;
   }

   public void setCodUsuAlt(BigDecimal codUsuAlt) {
        markAsChanged("CODUSUALT", codUsuAlt);
        this.codUsuAlt = codUsuAlt;
   }

   public BigDecimal getCodUsuCad() {
        return codUsuCad;
   }

   public void setCodUsuCad(BigDecimal codUsuCad) {
        markAsChanged("CODUSUCAD", codUsuCad);
        this.codUsuCad = codUsuCad;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
        this.dhAlter = dhAlter;
   }

   public Timestamp getDhCad() {
        return dhCad;
   }

   public void setDhCad(Timestamp dhCad) {
        markAsChanged("DHCAD", dhCad);
        this.dhCad = dhCad;
   }

   public String getUsarCtPadrao() {
        return usarCtPadrao;
   }

   public void setUsarCtPadrao(String usarCtPadrao) {
        markAsChanged("USARCTPADRAO", usarCtPadrao);
        this.usarCtPadrao = usarCtPadrao;
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
        this.ideFx = vo.asBigDecimal("IDEFX");
        this.controlePa = vo.asString("CONTROLEPA");
        this.codProdPa = vo.asBigDecimal("CODPRODPA");
        this.tipoTempo = vo.asString("TIPOTEMPO");
        this.unTempo = vo.asString("UNTEMPO");
        this.tempoAtividade = vo.asBigDecimal("TEMPOATIVIDADE");
        this.codCwc = vo.asBigDecimal("CODCWC");
        this.codWcp = vo.asBigDecimal("CODWCP");
        this.codUsuAlt = vo.asBigDecimal("CODUSUALT");
        this.codUsuCad = vo.asBigDecimal("CODUSUCAD");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.dhCad = vo.asTimestamp("DHCAD");
        this.usarCtPadrao = vo.asString("USARCTPADRAO");
        return this;
   }
}
