package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class RegistroAmostras extends AbstractSankhyaEntity<RegistroAmostras> {
   private BigDecimal idIproc;
   private String referencia;
   private BigDecimal codUsu;
   private Timestamp dhConferencia;
   private BigDecimal nuNota;
   private Timestamp dhProtocol;
   private BigDecimal codUsuProtocol;
   private String observacao;
   private BigDecimal codUsuConferencia;
   private Timestamp dtMov;
   private Timestamp dhColeta;
   private String fabricante;
   private String status;
   private Timestamp dtFabricacao;
   private Timestamp dtValidade;
   private BigDecimal codProd;
   private String controle;
   private BigDecimal codTipAmostra;
   private BigDecimal sequencia;
   private BigDecimal nuRam;
   private Timestamp dhAlter;
   private String desmembramento;
   private BigDecimal qtdTotVol;
   private BigDecimal qtdVolAmostra;
   private BigDecimal codUsuColeta;
   private BigDecimal qtdAmostra;

   public BigDecimal getIdIproc() {
        return idIproc;
   }

   public void setIdIproc(BigDecimal idIproc) {
        markAsChanged("IDIPROC", idIproc);
        this.idIproc = idIproc;
   }

   public String getReferencia() {
        return referencia;
   }

   public void setReferencia(String referencia) {
        markAsChanged("REFERENCIA", referencia);
        this.referencia = referencia;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public Timestamp getDhConferencia() {
        return dhConferencia;
   }

   public void setDhConferencia(Timestamp dhConferencia) {
        markAsChanged("DHCONFERENCIA", dhConferencia);
        this.dhConferencia = dhConferencia;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
        this.nuNota = nuNota;
   }

   public Timestamp getDhProtocol() {
        return dhProtocol;
   }

   public void setDhProtocol(Timestamp dhProtocol) {
        markAsChanged("DHPROTOCOL", dhProtocol);
        this.dhProtocol = dhProtocol;
   }

   public BigDecimal getCodUsuProtocol() {
        return codUsuProtocol;
   }

   public void setCodUsuProtocol(BigDecimal codUsuProtocol) {
        markAsChanged("CODUSUPROTOCOL", codUsuProtocol);
        this.codUsuProtocol = codUsuProtocol;
   }

   public String getObservacao() {
        return observacao;
   }

   public void setObservacao(String observacao) {
        markAsChanged("OBSERVACAO", observacao);
        this.observacao = observacao;
   }

   public BigDecimal getCodUsuConferencia() {
        return codUsuConferencia;
   }

   public void setCodUsuConferencia(BigDecimal codUsuConferencia) {
        markAsChanged("CODUSUCONFERENCIA", codUsuConferencia);
        this.codUsuConferencia = codUsuConferencia;
   }

   public Timestamp getDtMov() {
        return dtMov;
   }

   public void setDtMov(Timestamp dtMov) {
        markAsChanged("DTMOV", dtMov);
        this.dtMov = dtMov;
   }

   public Timestamp getDhColeta() {
        return dhColeta;
   }

   public void setDhColeta(Timestamp dhColeta) {
        markAsChanged("DHCOLETA", dhColeta);
        this.dhColeta = dhColeta;
   }

   public String getFabricante() {
        return fabricante;
   }

   public void setFabricante(String fabricante) {
        markAsChanged("FABRICANTE", fabricante);
        this.fabricante = fabricante;
   }

   public String getStatus() {
        return status;
   }

   public void setStatus(String status) {
        markAsChanged("STATUS", status);
        this.status = status;
   }

   public Timestamp getDtFabricacao() {
        return dtFabricacao;
   }

   public void setDtFabricacao(Timestamp dtFabricacao) {
        markAsChanged("DTFABRICACAO", dtFabricacao);
        this.dtFabricacao = dtFabricacao;
   }

   public Timestamp getDtValidade() {
        return dtValidade;
   }

   public void setDtValidade(Timestamp dtValidade) {
        markAsChanged("DTVALIDADE", dtValidade);
        this.dtValidade = dtValidade;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
        this.codProd = codProd;
   }

   public String getControle() {
        return controle;
   }

   public void setControle(String controle) {
        markAsChanged("CONTROLE", controle);
        this.controle = controle;
   }

   public BigDecimal getCodTipAmostra() {
        return codTipAmostra;
   }

   public void setCodTipAmostra(BigDecimal codTipAmostra) {
        markAsChanged("CODTIPAMOSTRA", codTipAmostra);
        this.codTipAmostra = codTipAmostra;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
        this.sequencia = sequencia;
   }

   public BigDecimal getNuRam() {
        return nuRam;
   }

   public void setNuRam(BigDecimal nuRam) {
        markAsChanged("NURAM", nuRam);
        this.nuRam = nuRam;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
        this.dhAlter = dhAlter;
   }

   public String getDesmembramento() {
        return desmembramento;
   }

   public void setDesmembramento(String desmembramento) {
        markAsChanged("DESMEMBRAMENTO", desmembramento);
        this.desmembramento = desmembramento;
   }

   public BigDecimal getQtdTotVol() {
        return qtdTotVol;
   }

   public void setQtdTotVol(BigDecimal qtdTotVol) {
        markAsChanged("QTDTOTVOL", qtdTotVol);
        this.qtdTotVol = qtdTotVol;
   }

   public BigDecimal getQtdVolAmostra() {
        return qtdVolAmostra;
   }

   public void setQtdVolAmostra(BigDecimal qtdVolAmostra) {
        markAsChanged("QTDVOLAMOSTRA", qtdVolAmostra);
        this.qtdVolAmostra = qtdVolAmostra;
   }

   public BigDecimal getCodUsuColeta() {
        return codUsuColeta;
   }

   public void setCodUsuColeta(BigDecimal codUsuColeta) {
        markAsChanged("CODUSUCOLETA", codUsuColeta);
        this.codUsuColeta = codUsuColeta;
   }

   public BigDecimal getQtdAmostra() {
        return qtdAmostra;
   }

   public void setQtdAmostra(BigDecimal qtdAmostra) {
        markAsChanged("QTDAMOSTRA", qtdAmostra);
        this.qtdAmostra = qtdAmostra;
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
        this.idIproc = vo.asBigDecimal("IDIPROC");
        this.referencia = vo.asString("REFERENCIA");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.dhConferencia = vo.asTimestamp("DHCONFERENCIA");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.dhProtocol = vo.asTimestamp("DHPROTOCOL");
        this.codUsuProtocol = vo.asBigDecimal("CODUSUPROTOCOL");
        this.observacao = vo.asString("OBSERVACAO");
        this.codUsuConferencia = vo.asBigDecimal("CODUSUCONFERENCIA");
        this.dtMov = vo.asTimestamp("DTMOV");
        this.dhColeta = vo.asTimestamp("DHCOLETA");
        this.fabricante = vo.asString("FABRICANTE");
        this.status = vo.asString("STATUS");
        this.dtFabricacao = vo.asTimestamp("DTFABRICACAO");
        this.dtValidade = vo.asTimestamp("DTVALIDADE");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.controle = vo.asString("CONTROLE");
        this.codTipAmostra = vo.asBigDecimal("CODTIPAMOSTRA");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.nuRam = vo.asBigDecimal("NURAM");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.desmembramento = vo.asString("DESMEMBRAMENTO");
        this.qtdTotVol = vo.asBigDecimal("QTDTOTVOL");
        this.qtdVolAmostra = vo.asBigDecimal("QTDVOLAMOSTRA");
        this.codUsuColeta = vo.asBigDecimal("CODUSUCOLETA");
        this.qtdAmostra = vo.asBigDecimal("QTDAMOSTRA");
        return this;
   }
}
