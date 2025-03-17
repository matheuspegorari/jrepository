package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class CargosEtapasProcesso implements SankhyaEntity<CargosEtapasProcesso> {

   private BigDecimal codEtapa;
   private BigDecimal seqEtapa;
   private BigDecimal codCargo;
   private BigDecimal codEmp;
   private BigDecimal peso;
   private Timestamp dtAlter;
   private BigDecimal codUsu;
   private BigDecimal pontuacaoMinima;
   private BigDecimal vlrEtapa;

   public BigDecimal getCodEtapa() {
        return codEtapa;
   }

   public void setCodEtapa(BigDecimal codEtapa) {
        this.codEtapa = codEtapa;
   }

   public BigDecimal getSeqEtapa() {
        return seqEtapa;
   }

   public void setSeqEtapa(BigDecimal seqEtapa) {
        this.seqEtapa = seqEtapa;
   }

   public BigDecimal getCodCargo() {
        return codCargo;
   }

   public void setCodCargo(BigDecimal codCargo) {
        this.codCargo = codCargo;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public BigDecimal getPeso() {
        return peso;
   }

   public void setPeso(BigDecimal peso) {
        this.peso = peso;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        this.dtAlter = dtAlter;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public BigDecimal getPontuacaoMinima() {
        return pontuacaoMinima;
   }

   public void setPontuacaoMinima(BigDecimal pontuacaoMinima) {
        this.pontuacaoMinima = pontuacaoMinima;
   }

   public BigDecimal getVlrEtapa() {
        return vlrEtapa;
   }

   public void setVlrEtapa(BigDecimal vlrEtapa) {
        this.vlrEtapa = vlrEtapa;
   }

   @Override
   public String getEntityName() {
        return "CargosEtapasProcesso";
   }

   @Override
   public CargosEtapasProcesso fromVO(DynamicVO vo) {
        this.codEtapa = vo.asBigDecimal("CODETAPA");
        this.seqEtapa = vo.asBigDecimal("SEQETAPA");
        this.codCargo = vo.asBigDecimal("CODCARGO");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.peso = vo.asBigDecimal("PESO");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.pontuacaoMinima = vo.asBigDecimal("PONTUACAOMINIMA");
        this.vlrEtapa = vo.asBigDecimal("VLRETAPA");
        return this;
   }
}
