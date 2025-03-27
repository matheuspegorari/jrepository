package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class RegistroAmostras extends AbstractSankhyaEntity<RegistroAmostras> {
   public BigDecimal getIdIproc() {
        return this.getVo().asBigDecimal("IDIPROC");
   }

   public void setIdIproc(BigDecimal idIproc) {
        markAsChanged("IDIPROC", idIproc);
   }

   public String getReferencia() {
        return this.getVo().asString("REFERENCIA");
   }

   public void setReferencia(String referencia) {
        markAsChanged("REFERENCIA", referencia);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public Timestamp getDhConferencia() {
        return this.getVo().asTimestamp("DHCONFERENCIA");
   }

   public void setDhConferencia(Timestamp dhConferencia) {
        markAsChanged("DHCONFERENCIA", dhConferencia);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public Timestamp getDhProtocol() {
        return this.getVo().asTimestamp("DHPROTOCOL");
   }

   public void setDhProtocol(Timestamp dhProtocol) {
        markAsChanged("DHPROTOCOL", dhProtocol);
   }

   public BigDecimal getCodUsuProtocol() {
        return this.getVo().asBigDecimal("CODUSUPROTOCOL");
   }

   public void setCodUsuProtocol(BigDecimal codUsuProtocol) {
        markAsChanged("CODUSUPROTOCOL", codUsuProtocol);
   }

   public String getObservacao() {
        return this.getVo().asString("OBSERVACAO");
   }

   public void setObservacao(String observacao) {
        markAsChanged("OBSERVACAO", observacao);
   }

   public BigDecimal getCodUsuConferencia() {
        return this.getVo().asBigDecimal("CODUSUCONFERENCIA");
   }

   public void setCodUsuConferencia(BigDecimal codUsuConferencia) {
        markAsChanged("CODUSUCONFERENCIA", codUsuConferencia);
   }

   public Timestamp getDtMov() {
        return this.getVo().asTimestamp("DTMOV");
   }

   public void setDtMov(Timestamp dtMov) {
        markAsChanged("DTMOV", dtMov);
   }

   public Timestamp getDhColeta() {
        return this.getVo().asTimestamp("DHCOLETA");
   }

   public void setDhColeta(Timestamp dhColeta) {
        markAsChanged("DHCOLETA", dhColeta);
   }

   public String getFabricante() {
        return this.getVo().asString("FABRICANTE");
   }

   public void setFabricante(String fabricante) {
        markAsChanged("FABRICANTE", fabricante);
   }

   public String getStatus() {
        return this.getVo().asString("STATUS");
   }

   public void setStatus(String status) {
        markAsChanged("STATUS", status);
   }

   public Timestamp getDtFabricacao() {
        return this.getVo().asTimestamp("DTFABRICACAO");
   }

   public void setDtFabricacao(Timestamp dtFabricacao) {
        markAsChanged("DTFABRICACAO", dtFabricacao);
   }

   public Timestamp getDtValidade() {
        return this.getVo().asTimestamp("DTVALIDADE");
   }

   public void setDtValidade(Timestamp dtValidade) {
        markAsChanged("DTVALIDADE", dtValidade);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public String getControle() {
        return this.getVo().asString("CONTROLE");
   }

   public void setControle(String controle) {
        markAsChanged("CONTROLE", controle);
   }

   public BigDecimal getCodTipAmostra() {
        return this.getVo().asBigDecimal("CODTIPAMOSTRA");
   }

   public void setCodTipAmostra(BigDecimal codTipAmostra) {
        markAsChanged("CODTIPAMOSTRA", codTipAmostra);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public BigDecimal getNuRam() {
        return this.getVo().asBigDecimal("NURAM");
   }

   public void setNuRam(BigDecimal nuRam) {
        markAsChanged("NURAM", nuRam);
   }

   public Timestamp getDhAlter() {
        return this.getVo().asTimestamp("DHALTER");
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
   }

   public String getDesmembramento() {
        return this.getVo().asString("DESMEMBRAMENTO");
   }

   public void setDesmembramento(String desmembramento) {
        markAsChanged("DESMEMBRAMENTO", desmembramento);
   }

   public BigDecimal getQtdTotVol() {
        return this.getVo().asBigDecimal("QTDTOTVOL");
   }

   public void setQtdTotVol(BigDecimal qtdTotVol) {
        markAsChanged("QTDTOTVOL", qtdTotVol);
   }

   public BigDecimal getQtdVolAmostra() {
        return this.getVo().asBigDecimal("QTDVOLAMOSTRA");
   }

   public void setQtdVolAmostra(BigDecimal qtdVolAmostra) {
        markAsChanged("QTDVOLAMOSTRA", qtdVolAmostra);
   }

   public BigDecimal getCodUsuColeta() {
        return this.getVo().asBigDecimal("CODUSUCOLETA");
   }

   public void setCodUsuColeta(BigDecimal codUsuColeta) {
        markAsChanged("CODUSUCOLETA", codUsuColeta);
   }

   public BigDecimal getQtdAmostra() {
        return this.getVo().asBigDecimal("QTDAMOSTRA");
   }

   public void setQtdAmostra(BigDecimal qtdAmostra) {
        markAsChanged("QTDAMOSTRA", qtdAmostra);
   }

   @Override
   public String getTableName() {
        return "TGFRAM";
   }

   @Override
   public String getEntityName() {
        return "RegistroAmostras";
   }

   @Override
   public RegistroAmostras fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
