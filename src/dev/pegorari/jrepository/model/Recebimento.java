package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class Recebimento extends AbstractSankhyaEntity<Recebimento> {
   private String descrsituacao;
   private String numPedido2;
   private BigDecimal codDoca;
   private BigDecimal codEndDoca;
   private BigDecimal codParc;
   private BigDecimal codUsu;
   private String confFinal;
   private Timestamp dtAlter;
   private Timestamp dtRecebimento;
   private String nomeParc;
   private BigDecimal nuConferencia;
   private BigDecimal nuNota;
   private BigDecimal nuRecebimento;
   private BigDecimal nuTarefa;
   private BigDecimal prioridade;
   private BigDecimal situacao;
   private BigDecimal statusConf;
   private String usaConfParcial;
   private BigDecimal nuTarefaCan;
   private String observacao;
   private BigDecimal tipoNota;

   public String getDescrsituacao() {
        return descrsituacao;
   }

   public void setDescrsituacao(String descrsituacao) {
        markAsChanged("DESCRSITUACAO", descrsituacao);
        this.descrsituacao = descrsituacao;
   }

   public String getNumPedido2() {
        return numPedido2;
   }

   public void setNumPedido2(String numPedido2) {
        markAsChanged("NUMPEDIDO2", numPedido2);
        this.numPedido2 = numPedido2;
   }

   public BigDecimal getCodDoca() {
        return codDoca;
   }

   public void setCodDoca(BigDecimal codDoca) {
        markAsChanged("CODDOCA", codDoca);
        this.codDoca = codDoca;
   }

   public BigDecimal getCodEndDoca() {
        return codEndDoca;
   }

   public void setCodEndDoca(BigDecimal codEndDoca) {
        markAsChanged("CODENDDOCA", codEndDoca);
        this.codEndDoca = codEndDoca;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
        this.codParc = codParc;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public String getConfFinal() {
        return confFinal;
   }

   public void setConfFinal(String confFinal) {
        markAsChanged("CONFFINAL", confFinal);
        this.confFinal = confFinal;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
        this.dtAlter = dtAlter;
   }

   public Timestamp getDtRecebimento() {
        return dtRecebimento;
   }

   public void setDtRecebimento(Timestamp dtRecebimento) {
        markAsChanged("DTRECEBIMENTO", dtRecebimento);
        this.dtRecebimento = dtRecebimento;
   }

   public String getNomeParc() {
        return nomeParc;
   }

   public void setNomeParc(String nomeParc) {
        markAsChanged("NOMEPARC", nomeParc);
        this.nomeParc = nomeParc;
   }

   public BigDecimal getNuConferencia() {
        return nuConferencia;
   }

   public void setNuConferencia(BigDecimal nuConferencia) {
        markAsChanged("NUCONFERENCIA", nuConferencia);
        this.nuConferencia = nuConferencia;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
        this.nuNota = nuNota;
   }

   public BigDecimal getNuRecebimento() {
        return nuRecebimento;
   }

   public void setNuRecebimento(BigDecimal nuRecebimento) {
        markAsChanged("NURECEBIMENTO", nuRecebimento);
        this.nuRecebimento = nuRecebimento;
   }

   public BigDecimal getNuTarefa() {
        return nuTarefa;
   }

   public void setNuTarefa(BigDecimal nuTarefa) {
        markAsChanged("NUTAREFA", nuTarefa);
        this.nuTarefa = nuTarefa;
   }

   public BigDecimal getPrioridade() {
        return prioridade;
   }

   public void setPrioridade(BigDecimal prioridade) {
        markAsChanged("PRIORIDADE", prioridade);
        this.prioridade = prioridade;
   }

   public BigDecimal getSituacao() {
        return situacao;
   }

   public void setSituacao(BigDecimal situacao) {
        markAsChanged("SITUACAO", situacao);
        this.situacao = situacao;
   }

   public BigDecimal getStatusConf() {
        return statusConf;
   }

   public void setStatusConf(BigDecimal statusConf) {
        markAsChanged("STATUSCONF", statusConf);
        this.statusConf = statusConf;
   }

   public String getUsaConfParcial() {
        return usaConfParcial;
   }

   public void setUsaConfParcial(String usaConfParcial) {
        markAsChanged("USACONFPARCIAL", usaConfParcial);
        this.usaConfParcial = usaConfParcial;
   }

   public BigDecimal getNuTarefaCan() {
        return nuTarefaCan;
   }

   public void setNuTarefaCan(BigDecimal nuTarefaCan) {
        markAsChanged("NUTAREFACAN", nuTarefaCan);
        this.nuTarefaCan = nuTarefaCan;
   }

   public String getObservacao() {
        return observacao;
   }

   public void setObservacao(String observacao) {
        markAsChanged("OBSERVACAO", observacao);
        this.observacao = observacao;
   }

   public BigDecimal getTipoNota() {
        return tipoNota;
   }

   public void setTipoNota(BigDecimal tipoNota) {
        markAsChanged("TIPONOTA", tipoNota);
        this.tipoNota = tipoNota;
   }

   @Override
   public String getTableName() {
        return "TGWREC";
   }

   @Override
   public String getEntityName() {
        return "Recebimento";
   }

   @Override
   public Recebimento fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.descrsituacao = vo.asString("DESCRSITUACAO");
        this.numPedido2 = vo.asString("NUMPEDIDO2");
        this.codDoca = vo.asBigDecimal("CODDOCA");
        this.codEndDoca = vo.asBigDecimal("CODENDDOCA");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.confFinal = vo.asString("CONFFINAL");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.dtRecebimento = vo.asTimestamp("DTRECEBIMENTO");
        this.nomeParc = vo.asString("NOMEPARC");
        this.nuConferencia = vo.asBigDecimal("NUCONFERENCIA");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.nuRecebimento = vo.asBigDecimal("NURECEBIMENTO");
        this.nuTarefa = vo.asBigDecimal("NUTAREFA");
        this.prioridade = vo.asBigDecimal("PRIORIDADE");
        this.situacao = vo.asBigDecimal("SITUACAO");
        this.statusConf = vo.asBigDecimal("STATUSCONF");
        this.usaConfParcial = vo.asString("USACONFPARCIAL");
        this.nuTarefaCan = vo.asBigDecimal("NUTAREFACAN");
        this.observacao = vo.asString("OBSERVACAO");
        this.tipoNota = vo.asBigDecimal("TIPONOTA");
        return this;
   }
}
