package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class PerfilCargo extends AbstractSankhyaEntity<PerfilCargo> {
   private BigDecimal codCargo;
   private BigDecimal codPerfil;
   private BigDecimal codUsu;
   private Timestamp dtAlter;
   private Timestamp dtFim;
   private Timestamp dtInicio;
   private String imprescindivel;
   private String obs;
   private BigDecimal periodicidade;
   private BigDecimal peso;
   private String tipoPeriodo;

   public BigDecimal getCodCargo() {
        return codCargo;
   }

   public void setCodCargo(BigDecimal codCargo) {
        this.codCargo = codCargo;
   }

   public BigDecimal getCodPerfil() {
        return codPerfil;
   }

   public void setCodPerfil(BigDecimal codPerfil) {
        this.codPerfil = codPerfil;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        this.dtAlter = dtAlter;
   }

   public Timestamp getDtFim() {
        return dtFim;
   }

   public void setDtFim(Timestamp dtFim) {
        this.dtFim = dtFim;
   }

   public Timestamp getDtInicio() {
        return dtInicio;
   }

   public void setDtInicio(Timestamp dtInicio) {
        this.dtInicio = dtInicio;
   }

   public String getImprescindivel() {
        return imprescindivel;
   }

   public void setImprescindivel(String imprescindivel) {
        this.imprescindivel = imprescindivel;
   }

   public String getObs() {
        return obs;
   }

   public void setObs(String obs) {
        this.obs = obs;
   }

   public BigDecimal getPeriodicidade() {
        return periodicidade;
   }

   public void setPeriodicidade(BigDecimal periodicidade) {
        this.periodicidade = periodicidade;
   }

   public BigDecimal getPeso() {
        return peso;
   }

   public void setPeso(BigDecimal peso) {
        this.peso = peso;
   }

   public String getTipoPeriodo() {
        return tipoPeriodo;
   }

   public void setTipoPeriodo(String tipoPeriodo) {
        this.tipoPeriodo = tipoPeriodo;
   }

   @Override
   public String getTableName() {
        return "TFPPCG";
   }

   @Override
   public String getEntityName() {
        return "PerfilCargo";
   }

   @Override
   public PerfilCargo fromVO(DynamicVO vo) {
        this.codCargo = vo.asBigDecimal("CODCARGO");
        this.codPerfil = vo.asBigDecimal("CODPERFIL");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.dtFim = vo.asTimestamp("DTFIM");
        this.dtInicio = vo.asTimestamp("DTINICIO");
        this.imprescindivel = vo.asString("IMPRESCINDIVEL");
        this.obs = vo.asString("OBS");
        this.periodicidade = vo.asBigDecimal("PERIODICIDADE");
        this.peso = vo.asBigDecimal("PESO");
        this.tipoPeriodo = vo.asString("TIPOPERIODO");
        return this;
   }
}
