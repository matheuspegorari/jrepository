package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class PerfilCargo extends AbstractSankhyaEntity<PerfilCargo> {
   public BigDecimal getCodCargo() {
        return this.getVo().asBigDecimal("CODCARGO");
   }

   public void setCodCargo(BigDecimal codCargo) {
        markAsChanged("CODCARGO", codCargo);
   }

   public BigDecimal getCodPerfil() {
        return this.getVo().asBigDecimal("CODPERFIL");
   }

   public void setCodPerfil(BigDecimal codPerfil) {
        markAsChanged("CODPERFIL", codPerfil);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public Timestamp getDtFim() {
        return this.getVo().asTimestamp("DTFIM");
   }

   public void setDtFim(Timestamp dtFim) {
        markAsChanged("DTFIM", dtFim);
   }

   public Timestamp getDtInicio() {
        return this.getVo().asTimestamp("DTINICIO");
   }

   public void setDtInicio(Timestamp dtInicio) {
        markAsChanged("DTINICIO", dtInicio);
   }

   public String getImprescindivel() {
        return this.getVo().asString("IMPRESCINDIVEL");
   }

   public void setImprescindivel(String imprescindivel) {
        markAsChanged("IMPRESCINDIVEL", imprescindivel);
   }

   public String getObs() {
        return this.getVo().asString("OBS");
   }

   public void setObs(String obs) {
        markAsChanged("OBS", obs);
   }

   public BigDecimal getPeriodicidade() {
        return this.getVo().asBigDecimal("PERIODICIDADE");
   }

   public void setPeriodicidade(BigDecimal periodicidade) {
        markAsChanged("PERIODICIDADE", periodicidade);
   }

   public BigDecimal getPeso() {
        return this.getVo().asBigDecimal("PESO");
   }

   public void setPeso(BigDecimal peso) {
        markAsChanged("PESO", peso);
   }

   public String getTipoPeriodo() {
        return this.getVo().asString("TIPOPERIODO");
   }

   public void setTipoPeriodo(String tipoPeriodo) {
        markAsChanged("TIPOPERIODO", tipoPeriodo);
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
        this.setVo(vo);
        return this;
   }
}
