package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class NegociacaoHorasCruzadas extends AbstractSankhyaEntity<NegociacaoHorasCruzadas> {
   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public BigDecimal getNuNegociacao() {
        return this.getVo().asBigDecimal("NUNEGOCIACAO");
   }

   public void setNuNegociacao(BigDecimal nuNegociacao) {
        markAsChanged("NUNEGOCIACAO", nuNegociacao);
   }

   public BigDecimal getMultHoraExtra() {
        return this.getVo().asBigDecimal("MULTHORAEXTRA");
   }

   public void setMultHoraExtra(BigDecimal multHoraExtra) {
        markAsChanged("MULTHORAEXTRA", multHoraExtra);
   }

   public BigDecimal getNuFap() {
        return this.getVo().asBigDecimal("NUFAP");
   }

   public void setNuFap(BigDecimal nuFap) {
        markAsChanged("NUFAP", nuFap);
   }

   public Timestamp getDtIni() {
        return this.getVo().asTimestamp("DTINI");
   }

   public void setDtIni(Timestamp dtIni) {
        markAsChanged("DTINI", dtIni);
   }

   public BigDecimal getCodUnnCompradora() {
        return this.getVo().asBigDecimal("CODUNNCOMPRADORA");
   }

   public void setCodUnnCompradora(BigDecimal codUnnCompradora) {
        markAsChanged("CODUNNCOMPRADORA", codUnnCompradora);
   }

   public BigDecimal getCodUnnVendedora() {
        return this.getVo().asBigDecimal("CODUNNVENDEDORA");
   }

   public void setCodUnnVendedora(BigDecimal codUnnVendedora) {
        markAsChanged("CODUNNVENDEDORA", codUnnVendedora);
   }

   public Timestamp getDtFin() {
        return this.getVo().asTimestamp("DTFIN");
   }

   public void setDtFin(Timestamp dtFin) {
        markAsChanged("DTFIN", dtFin);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public BigDecimal getVlrHora() {
        return this.getVo().asBigDecimal("VLRHORA");
   }

   public void setVlrHora(BigDecimal vlrHora) {
        markAsChanged("VLRHORA", vlrHora);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   @Override
   public String getTableName() {
        return "TCSNHC";
   }

   @Override
   public String getEntityName() {
        return "NegociacaoHorasCruzadas";
   }

   @Override
   public NegociacaoHorasCruzadas fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
