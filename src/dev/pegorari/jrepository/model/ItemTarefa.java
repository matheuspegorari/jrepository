package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ItemTarefa extends AbstractSankhyaEntity<ItemTarefa> {
   private BigDecimal nuRecebimento;
   private BigDecimal codArmazenagem;
   private BigDecimal codAreaSep;
   private String codBarraVolCompra;
   private BigDecimal codEmp;
   private BigDecimal codEndDestino;
   private BigDecimal codEndOrigem;
   private BigDecimal codEquip;
   private BigDecimal codLocal;
   private BigDecimal codProd;
   private BigDecimal codUsuExec;
   private String codVolCompra;
   private String codVolDest;
   private String codVolOrig;
   private String controle;
   private Timestamp dhFinalExec;
   private Timestamp dhInicialExec;
   private BigDecimal faseTarefa;
   private BigDecimal idPalete;
   private BigDecimal nuTarefa;
   private String ocorrencia;
   private BigDecimal prioridade;
   private BigDecimal qtdDest;
   private BigDecimal qtdOrig;
   private BigDecimal qtdVolCompra;
   private BigDecimal qtdVolPad;
   private BigDecimal sequencia;
   private String situacao;
   private String tipTarefa;
   private Timestamp dhFimMapa;
   private Timestamp dhImpMapa;
   private Timestamp dhInicioMapa;
   private BigDecimal idMapa;
   private String triado;

   public BigDecimal getNuRecebimento() {
        return nuRecebimento;
   }

   public void setNuRecebimento(BigDecimal nuRecebimento) {
        markAsChanged("NURECEBIMENTO", nuRecebimento);
        this.nuRecebimento = nuRecebimento;
   }

   public BigDecimal getCodArmazenagem() {
        return codArmazenagem;
   }

   public void setCodArmazenagem(BigDecimal codArmazenagem) {
        markAsChanged("CODARMAZENAGEM", codArmazenagem);
        this.codArmazenagem = codArmazenagem;
   }

   public BigDecimal getCodAreaSep() {
        return codAreaSep;
   }

   public void setCodAreaSep(BigDecimal codAreaSep) {
        markAsChanged("CODAREASEP", codAreaSep);
        this.codAreaSep = codAreaSep;
   }

   public String getCodBarraVolCompra() {
        return codBarraVolCompra;
   }

   public void setCodBarraVolCompra(String codBarraVolCompra) {
        markAsChanged("CODBARRAVOLCOMPRA", codBarraVolCompra);
        this.codBarraVolCompra = codBarraVolCompra;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public BigDecimal getCodEndDestino() {
        return codEndDestino;
   }

   public void setCodEndDestino(BigDecimal codEndDestino) {
        markAsChanged("CODENDDESTINO", codEndDestino);
        this.codEndDestino = codEndDestino;
   }

   public BigDecimal getCodEndOrigem() {
        return codEndOrigem;
   }

   public void setCodEndOrigem(BigDecimal codEndOrigem) {
        markAsChanged("CODENDORIGEM", codEndOrigem);
        this.codEndOrigem = codEndOrigem;
   }

   public BigDecimal getCodEquip() {
        return codEquip;
   }

   public void setCodEquip(BigDecimal codEquip) {
        markAsChanged("CODEQUIP", codEquip);
        this.codEquip = codEquip;
   }

   public BigDecimal getCodLocal() {
        return codLocal;
   }

   public void setCodLocal(BigDecimal codLocal) {
        markAsChanged("CODLOCAL", codLocal);
        this.codLocal = codLocal;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
        this.codProd = codProd;
   }

   public BigDecimal getCodUsuExec() {
        return codUsuExec;
   }

   public void setCodUsuExec(BigDecimal codUsuExec) {
        markAsChanged("CODUSUEXEC", codUsuExec);
        this.codUsuExec = codUsuExec;
   }

   public String getCodVolCompra() {
        return codVolCompra;
   }

   public void setCodVolCompra(String codVolCompra) {
        markAsChanged("CODVOLCOMPRA", codVolCompra);
        this.codVolCompra = codVolCompra;
   }

   public String getCodVolDest() {
        return codVolDest;
   }

   public void setCodVolDest(String codVolDest) {
        markAsChanged("CODVOLDEST", codVolDest);
        this.codVolDest = codVolDest;
   }

   public String getCodVolOrig() {
        return codVolOrig;
   }

   public void setCodVolOrig(String codVolOrig) {
        markAsChanged("CODVOLORIG", codVolOrig);
        this.codVolOrig = codVolOrig;
   }

   public String getControle() {
        return controle;
   }

   public void setControle(String controle) {
        markAsChanged("CONTROLE", controle);
        this.controle = controle;
   }

   public Timestamp getDhFinalExec() {
        return dhFinalExec;
   }

   public void setDhFinalExec(Timestamp dhFinalExec) {
        markAsChanged("DHFINALEXEC", dhFinalExec);
        this.dhFinalExec = dhFinalExec;
   }

   public Timestamp getDhInicialExec() {
        return dhInicialExec;
   }

   public void setDhInicialExec(Timestamp dhInicialExec) {
        markAsChanged("DHINICIALEXEC", dhInicialExec);
        this.dhInicialExec = dhInicialExec;
   }

   public BigDecimal getFaseTarefa() {
        return faseTarefa;
   }

   public void setFaseTarefa(BigDecimal faseTarefa) {
        markAsChanged("FASETAREFA", faseTarefa);
        this.faseTarefa = faseTarefa;
   }

   public BigDecimal getIdPalete() {
        return idPalete;
   }

   public void setIdPalete(BigDecimal idPalete) {
        markAsChanged("IDPALETE", idPalete);
        this.idPalete = idPalete;
   }

   public BigDecimal getNuTarefa() {
        return nuTarefa;
   }

   public void setNuTarefa(BigDecimal nuTarefa) {
        markAsChanged("NUTAREFA", nuTarefa);
        this.nuTarefa = nuTarefa;
   }

   public String getOcorrencia() {
        return ocorrencia;
   }

   public void setOcorrencia(String ocorrencia) {
        markAsChanged("OCORRENCIA", ocorrencia);
        this.ocorrencia = ocorrencia;
   }

   public BigDecimal getPrioridade() {
        return prioridade;
   }

   public void setPrioridade(BigDecimal prioridade) {
        markAsChanged("PRIORIDADE", prioridade);
        this.prioridade = prioridade;
   }

   public BigDecimal getQtdDest() {
        return qtdDest;
   }

   public void setQtdDest(BigDecimal qtdDest) {
        markAsChanged("QTDDEST", qtdDest);
        this.qtdDest = qtdDest;
   }

   public BigDecimal getQtdOrig() {
        return qtdOrig;
   }

   public void setQtdOrig(BigDecimal qtdOrig) {
        markAsChanged("QTDORIG", qtdOrig);
        this.qtdOrig = qtdOrig;
   }

   public BigDecimal getQtdVolCompra() {
        return qtdVolCompra;
   }

   public void setQtdVolCompra(BigDecimal qtdVolCompra) {
        markAsChanged("QTDVOLCOMPRA", qtdVolCompra);
        this.qtdVolCompra = qtdVolCompra;
   }

   public BigDecimal getQtdVolPad() {
        return qtdVolPad;
   }

   public void setQtdVolPad(BigDecimal qtdVolPad) {
        markAsChanged("QTDVOLPAD", qtdVolPad);
        this.qtdVolPad = qtdVolPad;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
        this.sequencia = sequencia;
   }

   public String getSituacao() {
        return situacao;
   }

   public void setSituacao(String situacao) {
        markAsChanged("SITUACAO", situacao);
        this.situacao = situacao;
   }

   public String getTipTarefa() {
        return tipTarefa;
   }

   public void setTipTarefa(String tipTarefa) {
        markAsChanged("TIPTAREFA", tipTarefa);
        this.tipTarefa = tipTarefa;
   }

   public Timestamp getDhFimMapa() {
        return dhFimMapa;
   }

   public void setDhFimMapa(Timestamp dhFimMapa) {
        markAsChanged("DHFIMMAPA", dhFimMapa);
        this.dhFimMapa = dhFimMapa;
   }

   public Timestamp getDhImpMapa() {
        return dhImpMapa;
   }

   public void setDhImpMapa(Timestamp dhImpMapa) {
        markAsChanged("DHIMPMAPA", dhImpMapa);
        this.dhImpMapa = dhImpMapa;
   }

   public Timestamp getDhInicioMapa() {
        return dhInicioMapa;
   }

   public void setDhInicioMapa(Timestamp dhInicioMapa) {
        markAsChanged("DHINICIOMAPA", dhInicioMapa);
        this.dhInicioMapa = dhInicioMapa;
   }

   public BigDecimal getIdMapa() {
        return idMapa;
   }

   public void setIdMapa(BigDecimal idMapa) {
        markAsChanged("IDMAPA", idMapa);
        this.idMapa = idMapa;
   }

   public String getTriado() {
        return triado;
   }

   public void setTriado(String triado) {
        markAsChanged("TRIADO", triado);
        this.triado = triado;
   }

   @Override
   public String getTableName() {
        return "TGWITT";
   }

   @Override
   public String getEntityName() {
        return "ItemTarefa";
   }

   @Override
   public ItemTarefa fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.nuRecebimento = vo.asBigDecimal("NURECEBIMENTO");
        this.codArmazenagem = vo.asBigDecimal("CODARMAZENAGEM");
        this.codAreaSep = vo.asBigDecimal("CODAREASEP");
        this.codBarraVolCompra = vo.asString("CODBARRAVOLCOMPRA");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codEndDestino = vo.asBigDecimal("CODENDDESTINO");
        this.codEndOrigem = vo.asBigDecimal("CODENDORIGEM");
        this.codEquip = vo.asBigDecimal("CODEQUIP");
        this.codLocal = vo.asBigDecimal("CODLOCAL");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.codUsuExec = vo.asBigDecimal("CODUSUEXEC");
        this.codVolCompra = vo.asString("CODVOLCOMPRA");
        this.codVolDest = vo.asString("CODVOLDEST");
        this.codVolOrig = vo.asString("CODVOLORIG");
        this.controle = vo.asString("CONTROLE");
        this.dhFinalExec = vo.asTimestamp("DHFINALEXEC");
        this.dhInicialExec = vo.asTimestamp("DHINICIALEXEC");
        this.faseTarefa = vo.asBigDecimal("FASETAREFA");
        this.idPalete = vo.asBigDecimal("IDPALETE");
        this.nuTarefa = vo.asBigDecimal("NUTAREFA");
        this.ocorrencia = vo.asString("OCORRENCIA");
        this.prioridade = vo.asBigDecimal("PRIORIDADE");
        this.qtdDest = vo.asBigDecimal("QTDDEST");
        this.qtdOrig = vo.asBigDecimal("QTDORIG");
        this.qtdVolCompra = vo.asBigDecimal("QTDVOLCOMPRA");
        this.qtdVolPad = vo.asBigDecimal("QTDVOLPAD");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.situacao = vo.asString("SITUACAO");
        this.tipTarefa = vo.asString("TIPTAREFA");
        this.dhFimMapa = vo.asTimestamp("DHFIMMAPA");
        this.dhImpMapa = vo.asTimestamp("DHIMPMAPA");
        this.dhInicioMapa = vo.asTimestamp("DHINICIOMAPA");
        this.idMapa = vo.asBigDecimal("IDMAPA");
        this.triado = vo.asString("TRIADO");
        return this;
   }
}
