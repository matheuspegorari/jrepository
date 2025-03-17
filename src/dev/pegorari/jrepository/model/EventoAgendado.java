package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class EventoAgendado extends AbstractSankhyaEntity<EventoAgendado> {
   private BigDecimal nuSelecao;
   private BigDecimal nuCurriculo;
   private BigDecimal codEtapa;
   private Timestamp dhAlterSinc;
   private Timestamp dhFinal;
   private Timestamp dhInicio;
   private Timestamp dhInicioPai;
   private Timestamp dhLcto;
   private String diaTodo;
   private String icalExp;
   private String idSinc;
   private String localEvento;
   private BigDecimal nuEvento;
   private BigDecimal nuEventoPai;
   private BigDecimal nuFap;
   private BigDecimal nuMetapa;
   private BigDecimal nuMos;
   private String sincronizar;
   private BigDecimal subOs;
   private String cancelado;
   private BigDecimal codParc;
   private BigDecimal codUsu;
   private BigDecimal codUsuLancador;
   private String confirmado;
   private String descrAbrev;
   private String descrLonga;
   private String motivo;
   private Timestamp dhCancelamento;
   private String changeKey;
   private String idOffice;
   private BigDecimal nuContrato;
   private BigDecimal falhaSinc;
   private BigDecimal codPap;

   public BigDecimal getNuSelecao() {
        return nuSelecao;
   }

   public void setNuSelecao(BigDecimal nuSelecao) {
        this.nuSelecao = nuSelecao;
   }

   public BigDecimal getNuCurriculo() {
        return nuCurriculo;
   }

   public void setNuCurriculo(BigDecimal nuCurriculo) {
        this.nuCurriculo = nuCurriculo;
   }

   public BigDecimal getCodEtapa() {
        return codEtapa;
   }

   public void setCodEtapa(BigDecimal codEtapa) {
        this.codEtapa = codEtapa;
   }

   public Timestamp getDhAlterSinc() {
        return dhAlterSinc;
   }

   public void setDhAlterSinc(Timestamp dhAlterSinc) {
        this.dhAlterSinc = dhAlterSinc;
   }

   public Timestamp getDhFinal() {
        return dhFinal;
   }

   public void setDhFinal(Timestamp dhFinal) {
        this.dhFinal = dhFinal;
   }

   public Timestamp getDhInicio() {
        return dhInicio;
   }

   public void setDhInicio(Timestamp dhInicio) {
        this.dhInicio = dhInicio;
   }

   public Timestamp getDhInicioPai() {
        return dhInicioPai;
   }

   public void setDhInicioPai(Timestamp dhInicioPai) {
        this.dhInicioPai = dhInicioPai;
   }

   public Timestamp getDhLcto() {
        return dhLcto;
   }

   public void setDhLcto(Timestamp dhLcto) {
        this.dhLcto = dhLcto;
   }

   public String getDiaTodo() {
        return diaTodo;
   }

   public void setDiaTodo(String diaTodo) {
        this.diaTodo = diaTodo;
   }

   public String getIcalExp() {
        return icalExp;
   }

   public void setIcalExp(String icalExp) {
        this.icalExp = icalExp;
   }

   public String getIdSinc() {
        return idSinc;
   }

   public void setIdSinc(String idSinc) {
        this.idSinc = idSinc;
   }

   public String getLocalEvento() {
        return localEvento;
   }

   public void setLocalEvento(String localEvento) {
        this.localEvento = localEvento;
   }

   public BigDecimal getNuEvento() {
        return nuEvento;
   }

   public void setNuEvento(BigDecimal nuEvento) {
        this.nuEvento = nuEvento;
   }

   public BigDecimal getNuEventoPai() {
        return nuEventoPai;
   }

   public void setNuEventoPai(BigDecimal nuEventoPai) {
        this.nuEventoPai = nuEventoPai;
   }

   public BigDecimal getNuFap() {
        return nuFap;
   }

   public void setNuFap(BigDecimal nuFap) {
        this.nuFap = nuFap;
   }

   public BigDecimal getNuMetapa() {
        return nuMetapa;
   }

   public void setNuMetapa(BigDecimal nuMetapa) {
        this.nuMetapa = nuMetapa;
   }

   public BigDecimal getNuMos() {
        return nuMos;
   }

   public void setNuMos(BigDecimal nuMos) {
        this.nuMos = nuMos;
   }

   public String getSincronizar() {
        return sincronizar;
   }

   public void setSincronizar(String sincronizar) {
        this.sincronizar = sincronizar;
   }

   public BigDecimal getSubOs() {
        return subOs;
   }

   public void setSubOs(BigDecimal subOs) {
        this.subOs = subOs;
   }

   public String getCancelado() {
        return cancelado;
   }

   public void setCancelado(String cancelado) {
        this.cancelado = cancelado;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        this.codParc = codParc;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public BigDecimal getCodUsuLancador() {
        return codUsuLancador;
   }

   public void setCodUsuLancador(BigDecimal codUsuLancador) {
        this.codUsuLancador = codUsuLancador;
   }

   public String getConfirmado() {
        return confirmado;
   }

   public void setConfirmado(String confirmado) {
        this.confirmado = confirmado;
   }

   public String getDescrAbrev() {
        return descrAbrev;
   }

   public void setDescrAbrev(String descrAbrev) {
        this.descrAbrev = descrAbrev;
   }

   public String getDescrLonga() {
        return descrLonga;
   }

   public void setDescrLonga(String descrLonga) {
        this.descrLonga = descrLonga;
   }

   public String getMotivo() {
        return motivo;
   }

   public void setMotivo(String motivo) {
        this.motivo = motivo;
   }

   public Timestamp getDhCancelamento() {
        return dhCancelamento;
   }

   public void setDhCancelamento(Timestamp dhCancelamento) {
        this.dhCancelamento = dhCancelamento;
   }

   public String getChangeKey() {
        return changeKey;
   }

   public void setChangeKey(String changeKey) {
        this.changeKey = changeKey;
   }

   public String getIdOffice() {
        return idOffice;
   }

   public void setIdOffice(String idOffice) {
        this.idOffice = idOffice;
   }

   public BigDecimal getNuContrato() {
        return nuContrato;
   }

   public void setNuContrato(BigDecimal nuContrato) {
        this.nuContrato = nuContrato;
   }

   public BigDecimal getFalhaSinc() {
        return falhaSinc;
   }

   public void setFalhaSinc(BigDecimal falhaSinc) {
        this.falhaSinc = falhaSinc;
   }

   public BigDecimal getCodPap() {
        return codPap;
   }

   public void setCodPap(BigDecimal codPap) {
        this.codPap = codPap;
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
        this.nuSelecao = vo.asBigDecimal("NUSELECAO");
        this.nuCurriculo = vo.asBigDecimal("NUCURRICULO");
        this.codEtapa = vo.asBigDecimal("CODETAPA");
        this.dhAlterSinc = vo.asTimestamp("DHALTERSINC");
        this.dhFinal = vo.asTimestamp("DHFINAL");
        this.dhInicio = vo.asTimestamp("DHINICIO");
        this.dhInicioPai = vo.asTimestamp("DHINICIOPAI");
        this.dhLcto = vo.asTimestamp("DHLCTO");
        this.diaTodo = vo.asString("DIATODO");
        this.icalExp = vo.asString("ICALEXP");
        this.idSinc = vo.asString("IDSINC");
        this.localEvento = vo.asString("LOCALEVENTO");
        this.nuEvento = vo.asBigDecimal("NUEVENTO");
        this.nuEventoPai = vo.asBigDecimal("NUEVENTOPAI");
        this.nuFap = vo.asBigDecimal("NUFAP");
        this.nuMetapa = vo.asBigDecimal("NUMETAPA");
        this.nuMos = vo.asBigDecimal("NUMOS");
        this.sincronizar = vo.asString("SINCRONIZAR");
        this.subOs = vo.asBigDecimal("SUBOS");
        this.cancelado = vo.asString("CANCELADO");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.codUsuLancador = vo.asBigDecimal("CODUSULANCADOR");
        this.confirmado = vo.asString("CONFIRMADO");
        this.descrAbrev = vo.asString("DESCRABREV");
        this.descrLonga = vo.asString("DESCRLONGA");
        this.motivo = vo.asString("MOTIVO");
        this.dhCancelamento = vo.asTimestamp("DHCANCELAMENTO");
        this.changeKey = vo.asString("CHANGEKEY");
        this.idOffice = vo.asString("IDOFFICE");
        this.nuContrato = vo.asBigDecimal("NUMCONTRATO");
        this.falhaSinc = vo.asBigDecimal("FALHASINC");
        this.codPap = vo.asBigDecimal("CODPAP");
        return this;
   }
}
