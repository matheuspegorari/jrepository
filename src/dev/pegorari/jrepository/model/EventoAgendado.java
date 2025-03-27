package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class EventoAgendado extends AbstractSankhyaEntity<EventoAgendado> {
   public BigDecimal getNuSelecao() {
        return this.getVo().asBigDecimal("NUSELECAO");
   }

   public void setNuSelecao(BigDecimal nuSelecao) {
        markAsChanged("NUSELECAO", nuSelecao);
   }

   public BigDecimal getNuCurriculo() {
        return this.getVo().asBigDecimal("NUCURRICULO");
   }

   public void setNuCurriculo(BigDecimal nuCurriculo) {
        markAsChanged("NUCURRICULO", nuCurriculo);
   }

   public BigDecimal getCodEtapa() {
        return this.getVo().asBigDecimal("CODETAPA");
   }

   public void setCodEtapa(BigDecimal codEtapa) {
        markAsChanged("CODETAPA", codEtapa);
   }

   public Timestamp getDhAlterSinc() {
        return this.getVo().asTimestamp("DHALTERSINC");
   }

   public void setDhAlterSinc(Timestamp dhAlterSinc) {
        markAsChanged("DHALTERSINC", dhAlterSinc);
   }

   public Timestamp getDhFinal() {
        return this.getVo().asTimestamp("DHFINAL");
   }

   public void setDhFinal(Timestamp dhFinal) {
        markAsChanged("DHFINAL", dhFinal);
   }

   public Timestamp getDhInicio() {
        return this.getVo().asTimestamp("DHINICIO");
   }

   public void setDhInicio(Timestamp dhInicio) {
        markAsChanged("DHINICIO", dhInicio);
   }

   public Timestamp getDhInicioPai() {
        return this.getVo().asTimestamp("DHINICIOPAI");
   }

   public void setDhInicioPai(Timestamp dhInicioPai) {
        markAsChanged("DHINICIOPAI", dhInicioPai);
   }

   public Timestamp getDhLcto() {
        return this.getVo().asTimestamp("DHLCTO");
   }

   public void setDhLcto(Timestamp dhLcto) {
        markAsChanged("DHLCTO", dhLcto);
   }

   public String getDiaTodo() {
        return this.getVo().asString("DIATODO");
   }

   public void setDiaTodo(String diaTodo) {
        markAsChanged("DIATODO", diaTodo);
   }

   public String getIcalExp() {
        return this.getVo().asString("ICALEXP");
   }

   public void setIcalExp(String icalExp) {
        markAsChanged("ICALEXP", icalExp);
   }

   public String getIdSinc() {
        return this.getVo().asString("IDSINC");
   }

   public void setIdSinc(String idSinc) {
        markAsChanged("IDSINC", idSinc);
   }

   public String getLocalEvento() {
        return this.getVo().asString("LOCALEVENTO");
   }

   public void setLocalEvento(String localEvento) {
        markAsChanged("LOCALEVENTO", localEvento);
   }

   public BigDecimal getNuEvento() {
        return this.getVo().asBigDecimal("NUEVENTO");
   }

   public void setNuEvento(BigDecimal nuEvento) {
        markAsChanged("NUEVENTO", nuEvento);
   }

   public BigDecimal getNuEventoPai() {
        return this.getVo().asBigDecimal("NUEVENTOPAI");
   }

   public void setNuEventoPai(BigDecimal nuEventoPai) {
        markAsChanged("NUEVENTOPAI", nuEventoPai);
   }

   public BigDecimal getNuFap() {
        return this.getVo().asBigDecimal("NUFAP");
   }

   public void setNuFap(BigDecimal nuFap) {
        markAsChanged("NUFAP", nuFap);
   }

   public BigDecimal getNuMetapa() {
        return this.getVo().asBigDecimal("NUMETAPA");
   }

   public void setNuMetapa(BigDecimal nuMetapa) {
        markAsChanged("NUMETAPA", nuMetapa);
   }

   public BigDecimal getNuMos() {
        return this.getVo().asBigDecimal("NUMOS");
   }

   public void setNuMos(BigDecimal nuMos) {
        markAsChanged("NUMOS", nuMos);
   }

   public String getSincronizar() {
        return this.getVo().asString("SINCRONIZAR");
   }

   public void setSincronizar(String sincronizar) {
        markAsChanged("SINCRONIZAR", sincronizar);
   }

   public BigDecimal getSubOs() {
        return this.getVo().asBigDecimal("SUBOS");
   }

   public void setSubOs(BigDecimal subOs) {
        markAsChanged("SUBOS", subOs);
   }

   public String getCancelado() {
        return this.getVo().asString("CANCELADO");
   }

   public void setCancelado(String cancelado) {
        markAsChanged("CANCELADO", cancelado);
   }

   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public BigDecimal getCodUsuLancador() {
        return this.getVo().asBigDecimal("CODUSULANCADOR");
   }

   public void setCodUsuLancador(BigDecimal codUsuLancador) {
        markAsChanged("CODUSULANCADOR", codUsuLancador);
   }

   public String getConfirmado() {
        return this.getVo().asString("CONFIRMADO");
   }

   public void setConfirmado(String confirmado) {
        markAsChanged("CONFIRMADO", confirmado);
   }

   public String getDescrAbrev() {
        return this.getVo().asString("DESCRABREV");
   }

   public void setDescrAbrev(String descrAbrev) {
        markAsChanged("DESCRABREV", descrAbrev);
   }

   public String getDescrLonga() {
        return this.getVo().asString("DESCRLONGA");
   }

   public void setDescrLonga(String descrLonga) {
        markAsChanged("DESCRLONGA", descrLonga);
   }

   public String getMotivo() {
        return this.getVo().asString("MOTIVO");
   }

   public void setMotivo(String motivo) {
        markAsChanged("MOTIVO", motivo);
   }

   public Timestamp getDhCancelamento() {
        return this.getVo().asTimestamp("DHCANCELAMENTO");
   }

   public void setDhCancelamento(Timestamp dhCancelamento) {
        markAsChanged("DHCANCELAMENTO", dhCancelamento);
   }

   public String getChangeKey() {
        return this.getVo().asString("CHANGEKEY");
   }

   public void setChangeKey(String changeKey) {
        markAsChanged("CHANGEKEY", changeKey);
   }

   public String getIdOffice() {
        return this.getVo().asString("IDOFFICE");
   }

   public void setIdOffice(String idOffice) {
        markAsChanged("IDOFFICE", idOffice);
   }

   public BigDecimal getNuContrato() {
        return this.getVo().asBigDecimal("NUMCONTRATO");
   }

   public void setNuContrato(BigDecimal nuContrato) {
        markAsChanged("NUMCONTRATO", nuContrato);
   }

   public BigDecimal getFalhaSinc() {
        return this.getVo().asBigDecimal("FALHASINC");
   }

   public void setFalhaSinc(BigDecimal falhaSinc) {
        markAsChanged("FALHASINC", falhaSinc);
   }

   public BigDecimal getCodPap() {
        return this.getVo().asBigDecimal("CODPAP");
   }

   public void setCodPap(BigDecimal codPap) {
        markAsChanged("CODPAP", codPap);
   }

   @Override
   public String getTableName() {
        return "TCSEAG";
   }

   @Override
   public String getEntityName() {
        return "EventoAgendado";
   }

   @Override
   public EventoAgendado fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
