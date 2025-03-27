package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class OrdemCarga extends AbstractSankhyaEntity<OrdemCarga> {
   public BigDecimal getCodDoca() {
        return this.getVo().asBigDecimal("CODDOCA");
   }

   public void setCodDoca(BigDecimal codDoca) {
        markAsChanged("CODDOCA", codDoca);
   }

   public BigDecimal getCodEmp() {
        return this.getVo().asBigDecimal("CODEMP");
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
   }

   public BigDecimal getCodLocal() {
        return this.getVo().asBigDecimal("CODLOCAL");
   }

   public void setCodLocal(BigDecimal codLocal) {
        markAsChanged("CODLOCAL", codLocal);
   }

   public BigDecimal getCodParcDest() {
        return this.getVo().asBigDecimal("CODPARCDEST");
   }

   public void setCodParcDest(BigDecimal codParcDest) {
        markAsChanged("CODPARCDEST", codParcDest);
   }

   public BigDecimal getCodParcMotorista() {
        return this.getVo().asBigDecimal("CODPARCMOTORISTA");
   }

   public void setCodParcMotorista(BigDecimal codParcMotorista) {
        markAsChanged("CODPARCMOTORISTA", codParcMotorista);
   }

   public BigDecimal getCodParcOrig() {
        return this.getVo().asBigDecimal("CODPARCORIG");
   }

   public void setCodParcOrig(BigDecimal codParcOrig) {
        markAsChanged("CODPARCORIG", codParcOrig);
   }

   public BigDecimal getCodParcTransp() {
        return this.getVo().asBigDecimal("CODPARCTRANSP");
   }

   public void setCodParcTransp(BigDecimal codParcTransp) {
        markAsChanged("CODPARCTRANSP", codParcTransp);
   }

   public BigDecimal getCodReg() {
        return this.getVo().asBigDecimal("CODREG");
   }

   public void setCodReg(BigDecimal codReg) {
        markAsChanged("CODREG", codReg);
   }

   public BigDecimal getCodRota() {
        return this.getVo().asBigDecimal("CODROTA");
   }

   public void setCodRota(BigDecimal codRota) {
        markAsChanged("CODROTA", codRota);
   }

   public BigDecimal getCodTipoPerTransb() {
        return this.getVo().asBigDecimal("CODTIPOPERTRANSB");
   }

   public void setCodTipoPerTransb(BigDecimal codTipoPerTransb) {
        markAsChanged("CODTIPOPERTRANSB", codTipoPerTransb);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public BigDecimal getCodUsuRetorno() {
        return this.getVo().asBigDecimal("CODUSURETORNO");
   }

   public void setCodUsuRetorno(BigDecimal codUsuRetorno) {
        markAsChanged("CODUSURETORNO", codUsuRetorno);
   }

   public BigDecimal getCodVeiculo() {
        return this.getVo().asBigDecimal("CODVEICULO");
   }

   public void setCodVeiculo(BigDecimal codVeiculo) {
        markAsChanged("CODVEICULO", codVeiculo);
   }

   public Timestamp getDhFinalPesagem() {
        return this.getVo().asTimestamp("DHFINALPESAGEM");
   }

   public void setDhFinalPesagem(Timestamp dhFinalPesagem) {
        markAsChanged("DHFINALPESAGEM", dhFinalPesagem);
   }

   public Timestamp getDhInicialPesagem() {
        return this.getVo().asTimestamp("DHINICIALPESAGEM");
   }

   public void setDhInicialPesagem(Timestamp dhInicialPesagem) {
        markAsChanged("DHINICIALPESAGEM", dhInicialPesagem);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   public Timestamp getDtAlterRotCat() {
        return this.getVo().asTimestamp("DTALTERROTCAT");
   }

   public void setDtAlterRotCat(Timestamp dtAlterRotCat) {
        markAsChanged("DTALTERROTCAT", dtAlterRotCat);
   }

   public Timestamp getDtInic() {
        return this.getVo().asTimestamp("DTINIC");
   }

   public void setDtInic(Timestamp dtInic) {
        markAsChanged("DTINIC", dtInic);
   }

   public Timestamp getDtPrevSaida() {
        return this.getVo().asTimestamp("DTPREVSAIDA");
   }

   public void setDtPrevSaida(Timestamp dtPrevSaida) {
        markAsChanged("DTPREVSAIDA", dtPrevSaida);
   }

   public Timestamp getDtRetorno() {
        return this.getVo().asTimestamp("DTRETORNO");
   }

   public void setDtRetorno(Timestamp dtRetorno) {
        markAsChanged("DTRETORNO", dtRetorno);
   }

   public String getEntSai() {
        return this.getVo().asString("ENTSAI");
   }

   public void setEntSai(String entSai) {
        markAsChanged("ENTSAI", entSai);
   }

   public String getFreteCalc() {
        return this.getVo().asString("FRETECALC");
   }

   public void setFreteCalc(String freteCalc) {
        markAsChanged("FRETECALC", freteCalc);
   }

   public BigDecimal getM3Max() {
        return this.getVo().asBigDecimal("M3MAX");
   }

   public void setM3Max(BigDecimal m3Max) {
        markAsChanged("M3MAX", m3Max);
   }

   public BigDecimal getNroFrota() {
        return this.getVo().asBigDecimal("NROFROTA");
   }

   public void setNroFrota(BigDecimal nroFrota) {
        markAsChanged("NROFROTA", nroFrota);
   }

   public BigDecimal getNuCaixa() {
        return this.getVo().asBigDecimal("NUCAIXA");
   }

   public void setNuCaixa(BigDecimal nuCaixa) {
        markAsChanged("NUCAIXA", nuCaixa);
   }

   public BigDecimal getNuFinAcerto() {
        return this.getVo().asBigDecimal("NUFINACERTO");
   }

   public void setNuFinAcerto(BigDecimal nuFinAcerto) {
        markAsChanged("NUFINACERTO", nuFinAcerto);
   }

   public BigDecimal getPrioridade() {
        return this.getVo().asBigDecimal("PRIORIDADE");
   }

   public void setPrioridade(BigDecimal prioridade) {
        markAsChanged("PRIORIDADE", prioridade);
   }

   public BigDecimal getQtdEntrega() {
        return this.getVo().asBigDecimal("QTDENTREGA");
   }

   public void setQtdEntrega(BigDecimal qtdEntrega) {
        markAsChanged("QTDENTREGA", qtdEntrega);
   }

   public String getRoteiro() {
        return this.getVo().asString("ROTEIRO");
   }

   public void setRoteiro(String roteiro) {
        markAsChanged("ROTEIRO", roteiro);
   }

   public String getTipDist() {
        return this.getVo().asString("TIPDIST");
   }

   public void setTipDist(String tipDist) {
        markAsChanged("TIPDIST", tipDist);
   }

   public String getTipEmbalagem() {
        return this.getVo().asString("TIPEMBALAGEM");
   }

   public void setTipEmbalagem(String tipEmbalagem) {
        markAsChanged("TIPEMBALAGEM", tipEmbalagem);
   }

   public BigDecimal getTotalCarga() {
        return this.getVo().asBigDecimal("TOTALCARGA");
   }

   public void setTotalCarga(BigDecimal totalCarga) {
        markAsChanged("TOTALCARGA", totalCarga);
   }

   public String getVincRot() {
        return this.getVo().asString("VINCROT");
   }

   public void setVincRot(String vincRot) {
        markAsChanged("VINCROT", vincRot);
   }

   public BigDecimal getVlrDifAcerto() {
        return this.getVo().asBigDecimal("VLRDIFACERTO");
   }

   public void setVlrDifAcerto(BigDecimal vlrDifAcerto) {
        markAsChanged("VLRDIFACERTO", vlrDifAcerto);
   }

   public BigDecimal getVlrFrete() {
        return this.getVo().asBigDecimal("VLRFRETE");
   }

   public void setVlrFrete(BigDecimal vlrFrete) {
        markAsChanged("VLRFRETE", vlrFrete);
   }

   public Timestamp getHoraSaida() {
        return this.getVo().asTimestamp("HORASAIDA");
   }

   public void setHoraSaida(Timestamp horaSaida) {
        markAsChanged("HORASAIDA", horaSaida);
   }

   public String getIdOrdemCarga() {
        return this.getVo().asString("IDORDEMCARGA");
   }

   public void setIdOrdemCarga(String idOrdemCarga) {
        markAsChanged("IDORDEMCARGA", idOrdemCarga);
   }

   public String getJustificativa() {
        return this.getVo().asString("JUSTIFICATIVA");
   }

   public void setJustificativa(String justificativa) {
        markAsChanged("JUSTIFICATIVA", justificativa);
   }

   public BigDecimal getKmFin() {
        return this.getVo().asBigDecimal("KMFIN");
   }

   public void setKmFin(BigDecimal kmFin) {
        markAsChanged("KMFIN", kmFin);
   }

   public BigDecimal getKmInic() {
        return this.getVo().asBigDecimal("KMINIC");
   }

   public void setKmInic(BigDecimal kmInic) {
        markAsChanged("KMINIC", kmInic);
   }

   public String getStatusAval() {
        return this.getVo().asString("STATUSAVAL");
   }

   public void setStatusAval(String statusAval) {
        markAsChanged("STATUSAVAL", statusAval);
   }

   public String getTemTransbordo() {
        return this.getVo().asString("TEMTRANSBORDO");
   }

   public void setTemTransbordo(String temTransbordo) {
        markAsChanged("TEMTRANSBORDO", temTransbordo);
   }

   public BigDecimal getTipCalcFrete() {
        return this.getVo().asBigDecimal("TIPCALCFRETE");
   }

   public void setTipCalcFrete(BigDecimal tipCalcFrete) {
        markAsChanged("TIPCALCFRETE", tipCalcFrete);
   }

   public String getTipCarga() {
        return this.getVo().asString("TIPCARGA");
   }

   public void setTipCarga(String tipCarga) {
        markAsChanged("TIPCARGA", tipCarga);
   }

   public BigDecimal getSeqCarga() {
        return this.getVo().asBigDecimal("SEQCARGA");
   }

   public void setSeqCarga(BigDecimal seqCarga) {
        markAsChanged("SEQCARGA", seqCarga);
   }

   public String getSituacao() {
        return this.getVo().asString("SITUACAO");
   }

   public void setSituacao(String situacao) {
        markAsChanged("SITUACAO", situacao);
   }

   public String getObsMotorista() {
        return this.getVo().asString("OBSMOTORISTA");
   }

   public void setObsMotorista(String obsMotorista) {
        markAsChanged("OBSMOTORISTA", obsMotorista);
   }

   public BigDecimal getOrdemCarga() {
        return this.getVo().asBigDecimal("ORDEMCARGA");
   }

   public void setOrdemCarga(BigDecimal ordemCarga) {
        markAsChanged("ORDEMCARGA", ordemCarga);
   }

   public BigDecimal getOrdemCargaPai() {
        return this.getVo().asBigDecimal("ORDEMCARGAPAI");
   }

   public void setOrdemCargaPai(BigDecimal ordemCargaPai) {
        markAsChanged("ORDEMCARGAPAI", ordemCargaPai);
   }

   public BigDecimal getPesoMax() {
        return this.getVo().asBigDecimal("PESOMAX");
   }

   public void setPesoMax(BigDecimal pesoMax) {
        markAsChanged("PESOMAX", pesoMax);
   }

   public BigDecimal getNuViag() {
        return this.getVo().asBigDecimal("NUVIAG");
   }

   public void setNuViag(BigDecimal nuViag) {
        markAsChanged("NUVIAG", nuViag);
   }

   public String getEnvioWms() {
        return this.getVo().asString("ENVIOWMS");
   }

   public void setEnvioWms(String envioWms) {
        markAsChanged("ENVIOWMS", envioWms);
   }

   public BigDecimal getCodEmpPai() {
        return this.getVo().asBigDecimal("CODEMPPAI");
   }

   public void setCodEmpPai(BigDecimal codEmpPai) {
        markAsChanged("CODEMPPAI", codEmpPai);
   }

   @Override
   public String getTableName() {
        return "TGFORD";
   }

   @Override
   public String getEntityName() {
        return "OrdemCarga";
   }

   @Override
   public OrdemCarga fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
