package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Feriado extends AbstractSankhyaEntity<Feriado> {
   public BigDecimal getCodCid() {
        return this.getVo().asBigDecimal("CODCID");
   }

   public void setCodCid(BigDecimal codCid) {
        markAsChanged("CODCID", codCid);
   }

   public BigDecimal getCodPais() {
        return this.getVo().asBigDecimal("CODPAIS");
   }

   public void setCodPais(BigDecimal codPais) {
        markAsChanged("CODPAIS", codPais);
   }

   public BigDecimal getCodUf() {
        return this.getVo().asBigDecimal("CODUF");
   }

   public void setCodUf(BigDecimal codUf) {
        markAsChanged("CODUF", codUf);
   }

   public String getDescFeriado() {
        return this.getVo().asString("DESCRFERIADO");
   }

   public void setDescFeriado(String descFeriado) {
        markAsChanged("DESCRFERIADO", descFeriado);
   }

   public Timestamp getDtFeriado() {
        return this.getVo().asTimestamp("DTFERIADO");
   }

   public void setDtFeriado(Timestamp dtFeriado) {
        markAsChanged("DTFERIADO", dtFeriado);
   }

   public String getNacional() {
        return this.getVo().asString("NACIONAL");
   }

   public void setNacional(String nacional) {
        markAsChanged("NACIONAL", nacional);
   }

   public String getObrigatorio() {
        return this.getVo().asString("OBRIGATORIO");
   }

   public void setObrigatorio(String obrigatorio) {
        markAsChanged("OBRIGATORIO", obrigatorio);
   }

   public String getRecorrente() {
        return this.getVo().asString("RECORRENTE");
   }

   public void setRecorrente(String recorrente) {
        markAsChanged("RECORRENTE", recorrente);
   }

   public String getUsaNoPonto() {
        return this.getVo().asString("USANOPONTO");
   }

   public void setUsaNoPonto(String usaNoPonto) {
        markAsChanged("USANOPONTO", usaNoPonto);
   }

   @Override
   public String getTableName() {
        return "TSIFER";
   }

   @Override
   public String getEntityName() {
        return "Feriado";
   }

   @Override
   public Feriado fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
