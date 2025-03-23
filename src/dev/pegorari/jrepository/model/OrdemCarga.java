package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class OrdemCarga extends AbstractSankhyaEntity<OrdemCarga> {
   private BigDecimal codDoca;
   private BigDecimal codEmp;
   private BigDecimal codLocal;
   private BigDecimal codParcDest;
   private BigDecimal codParcMotorista;
   private BigDecimal codParcOrig;
   private BigDecimal codParcTransp;
   private BigDecimal codReg;
   private BigDecimal codRota;
   private BigDecimal codTipoPerTransb;
   private BigDecimal codUsu;
   private BigDecimal codUsuRetorno;
   private BigDecimal codVeiculo;
   private Timestamp dhFinalPesagem;
   private Timestamp dhInicialPesagem;
   private Timestamp dtAlter;
   private Timestamp dtAlterRotCat;
   private Timestamp dtInic;
   private Timestamp dtPrevSaida;
   private Timestamp dtRetorno;
   private String entSai;
   private String freteCalc;
   private BigDecimal m3Max;
   private BigDecimal nroFrota;
   private BigDecimal nuCaixa;
   private BigDecimal nuFinAcerto;
   private BigDecimal prioridade;
   private BigDecimal qtdEntrega;
   private String roteiro;
   private String tipDist;
   private String tipEmbalagem;
   private BigDecimal totalCarga;
   private String vincRot;
   private BigDecimal vlrDifAcerto;
   private BigDecimal vlrFrete;
   private Timestamp horaSaida;
   private String idOrdemCarga;
   private String justificativa;
   private BigDecimal kmFin;
   private BigDecimal kmInic;
   private String statusAval;
   private String temTransbordo;
   private BigDecimal tipCalcFrete;
   private String tipCarga;
   private BigDecimal seqCarga;
   private String situacao;
   private String obsMotorista;
   private BigDecimal ordemCarga;
   private BigDecimal ordemCargaPai;
   private BigDecimal pesoMax;
   private BigDecimal nuViag;
   private String envioWms;
   private BigDecimal codEmpPai;

   public BigDecimal getCodDoca() {
        return codDoca;
   }

   public void setCodDoca(BigDecimal codDoca) {
        markAsChanged("CODDOCA", codDoca);
        this.codDoca = codDoca;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        markAsChanged("CODEMP", codEmp);
        this.codEmp = codEmp;
   }

   public BigDecimal getCodLocal() {
        return codLocal;
   }

   public void setCodLocal(BigDecimal codLocal) {
        markAsChanged("CODLOCAL", codLocal);
        this.codLocal = codLocal;
   }

   public BigDecimal getCodParcDest() {
        return codParcDest;
   }

   public void setCodParcDest(BigDecimal codParcDest) {
        markAsChanged("CODPARCDEST", codParcDest);
        this.codParcDest = codParcDest;
   }

   public BigDecimal getCodParcMotorista() {
        return codParcMotorista;
   }

   public void setCodParcMotorista(BigDecimal codParcMotorista) {
        markAsChanged("CODPARCMOTORISTA", codParcMotorista);
        this.codParcMotorista = codParcMotorista;
   }

   public BigDecimal getCodParcOrig() {
        return codParcOrig;
   }

   public void setCodParcOrig(BigDecimal codParcOrig) {
        markAsChanged("CODPARCORIG", codParcOrig);
        this.codParcOrig = codParcOrig;
   }

   public BigDecimal getCodParcTransp() {
        return codParcTransp;
   }

   public void setCodParcTransp(BigDecimal codParcTransp) {
        markAsChanged("CODPARCTRANSP", codParcTransp);
        this.codParcTransp = codParcTransp;
   }

   public BigDecimal getCodReg() {
        return codReg;
   }

   public void setCodReg(BigDecimal codReg) {
        markAsChanged("CODREG", codReg);
        this.codReg = codReg;
   }

   public BigDecimal getCodRota() {
        return codRota;
   }

   public void setCodRota(BigDecimal codRota) {
        markAsChanged("CODROTA", codRota);
        this.codRota = codRota;
   }

   public BigDecimal getCodTipoPerTransb() {
        return codTipoPerTransb;
   }

   public void setCodTipoPerTransb(BigDecimal codTipoPerTransb) {
        markAsChanged("CODTIPOPERTRANSB", codTipoPerTransb);
        this.codTipoPerTransb = codTipoPerTransb;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public BigDecimal getCodUsuRetorno() {
        return codUsuRetorno;
   }

   public void setCodUsuRetorno(BigDecimal codUsuRetorno) {
        markAsChanged("CODUSURETORNO", codUsuRetorno);
        this.codUsuRetorno = codUsuRetorno;
   }

   public BigDecimal getCodVeiculo() {
        return codVeiculo;
   }

   public void setCodVeiculo(BigDecimal codVeiculo) {
        markAsChanged("CODVEICULO", codVeiculo);
        this.codVeiculo = codVeiculo;
   }

   public Timestamp getDhFinalPesagem() {
        return dhFinalPesagem;
   }

   public void setDhFinalPesagem(Timestamp dhFinalPesagem) {
        markAsChanged("DHFINALPESAGEM", dhFinalPesagem);
        this.dhFinalPesagem = dhFinalPesagem;
   }

   public Timestamp getDhInicialPesagem() {
        return dhInicialPesagem;
   }

   public void setDhInicialPesagem(Timestamp dhInicialPesagem) {
        markAsChanged("DHINICIALPESAGEM", dhInicialPesagem);
        this.dhInicialPesagem = dhInicialPesagem;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
        this.dtAlter = dtAlter;
   }

   public Timestamp getDtAlterRotCat() {
        return dtAlterRotCat;
   }

   public void setDtAlterRotCat(Timestamp dtAlterRotCat) {
        markAsChanged("DTALTERROTCAT", dtAlterRotCat);
        this.dtAlterRotCat = dtAlterRotCat;
   }

   public Timestamp getDtInic() {
        return dtInic;
   }

   public void setDtInic(Timestamp dtInic) {
        markAsChanged("DTINIC", dtInic);
        this.dtInic = dtInic;
   }

   public Timestamp getDtPrevSaida() {
        return dtPrevSaida;
   }

   public void setDtPrevSaida(Timestamp dtPrevSaida) {
        markAsChanged("DTPREVSAIDA", dtPrevSaida);
        this.dtPrevSaida = dtPrevSaida;
   }

   public Timestamp getDtRetorno() {
        return dtRetorno;
   }

   public void setDtRetorno(Timestamp dtRetorno) {
        markAsChanged("DTRETORNO", dtRetorno);
        this.dtRetorno = dtRetorno;
   }

   public String getEntSai() {
        return entSai;
   }

   public void setEntSai(String entSai) {
        markAsChanged("ENTSAI", entSai);
        this.entSai = entSai;
   }

   public String getFreteCalc() {
        return freteCalc;
   }

   public void setFreteCalc(String freteCalc) {
        markAsChanged("FRETECALC", freteCalc);
        this.freteCalc = freteCalc;
   }

   public BigDecimal getM3Max() {
        return m3Max;
   }

   public void setM3Max(BigDecimal m3Max) {
        markAsChanged("M3MAX", m3Max);
        this.m3Max = m3Max;
   }

   public BigDecimal getNroFrota() {
        return nroFrota;
   }

   public void setNroFrota(BigDecimal nroFrota) {
        markAsChanged("NROFROTA", nroFrota);
        this.nroFrota = nroFrota;
   }

   public BigDecimal getNuCaixa() {
        return nuCaixa;
   }

   public void setNuCaixa(BigDecimal nuCaixa) {
        markAsChanged("NUCAIXA", nuCaixa);
        this.nuCaixa = nuCaixa;
   }

   public BigDecimal getNuFinAcerto() {
        return nuFinAcerto;
   }

   public void setNuFinAcerto(BigDecimal nuFinAcerto) {
        markAsChanged("NUFINACERTO", nuFinAcerto);
        this.nuFinAcerto = nuFinAcerto;
   }

   public BigDecimal getPrioridade() {
        return prioridade;
   }

   public void setPrioridade(BigDecimal prioridade) {
        markAsChanged("PRIORIDADE", prioridade);
        this.prioridade = prioridade;
   }

   public BigDecimal getQtdEntrega() {
        return qtdEntrega;
   }

   public void setQtdEntrega(BigDecimal qtdEntrega) {
        markAsChanged("QTDENTREGA", qtdEntrega);
        this.qtdEntrega = qtdEntrega;
   }

   public String getRoteiro() {
        return roteiro;
   }

   public void setRoteiro(String roteiro) {
        markAsChanged("ROTEIRO", roteiro);
        this.roteiro = roteiro;
   }

   public String getTipDist() {
        return tipDist;
   }

   public void setTipDist(String tipDist) {
        markAsChanged("TIPDIST", tipDist);
        this.tipDist = tipDist;
   }

   public String getTipEmbalagem() {
        return tipEmbalagem;
   }

   public void setTipEmbalagem(String tipEmbalagem) {
        markAsChanged("TIPEMBALAGEM", tipEmbalagem);
        this.tipEmbalagem = tipEmbalagem;
   }

   public BigDecimal getTotalCarga() {
        return totalCarga;
   }

   public void setTotalCarga(BigDecimal totalCarga) {
        markAsChanged("TOTALCARGA", totalCarga);
        this.totalCarga = totalCarga;
   }

   public String getVincRot() {
        return vincRot;
   }

   public void setVincRot(String vincRot) {
        markAsChanged("VINCROT", vincRot);
        this.vincRot = vincRot;
   }

   public BigDecimal getVlrDifAcerto() {
        return vlrDifAcerto;
   }

   public void setVlrDifAcerto(BigDecimal vlrDifAcerto) {
        markAsChanged("VLRDIFACERTO", vlrDifAcerto);
        this.vlrDifAcerto = vlrDifAcerto;
   }

   public BigDecimal getVlrFrete() {
        return vlrFrete;
   }

   public void setVlrFrete(BigDecimal vlrFrete) {
        markAsChanged("VLRFRETE", vlrFrete);
        this.vlrFrete = vlrFrete;
   }

   public Timestamp getHoraSaida() {
        return horaSaida;
   }

   public void setHoraSaida(Timestamp horaSaida) {
        markAsChanged("HORASAIDA", horaSaida);
        this.horaSaida = horaSaida;
   }

   public String getIdOrdemCarga() {
        return idOrdemCarga;
   }

   public void setIdOrdemCarga(String idOrdemCarga) {
        markAsChanged("IDORDEMCARGA", idOrdemCarga);
        this.idOrdemCarga = idOrdemCarga;
   }

   public String getJustificativa() {
        return justificativa;
   }

   public void setJustificativa(String justificativa) {
        markAsChanged("JUSTIFICATIVA", justificativa);
        this.justificativa = justificativa;
   }

   public BigDecimal getKmFin() {
        return kmFin;
   }

   public void setKmFin(BigDecimal kmFin) {
        markAsChanged("KMFIN", kmFin);
        this.kmFin = kmFin;
   }

   public BigDecimal getKmInic() {
        return kmInic;
   }

   public void setKmInic(BigDecimal kmInic) {
        markAsChanged("KMINIC", kmInic);
        this.kmInic = kmInic;
   }

   public String getStatusAval() {
        return statusAval;
   }

   public void setStatusAval(String statusAval) {
        markAsChanged("STATUSAVAL", statusAval);
        this.statusAval = statusAval;
   }

   public String getTemTransbordo() {
        return temTransbordo;
   }

   public void setTemTransbordo(String temTransbordo) {
        markAsChanged("TEMTRANSBORDO", temTransbordo);
        this.temTransbordo = temTransbordo;
   }

   public BigDecimal getTipCalcFrete() {
        return tipCalcFrete;
   }

   public void setTipCalcFrete(BigDecimal tipCalcFrete) {
        markAsChanged("TIPCALCFRETE", tipCalcFrete);
        this.tipCalcFrete = tipCalcFrete;
   }

   public String getTipCarga() {
        return tipCarga;
   }

   public void setTipCarga(String tipCarga) {
        markAsChanged("TIPCARGA", tipCarga);
        this.tipCarga = tipCarga;
   }

   public BigDecimal getSeqCarga() {
        return seqCarga;
   }

   public void setSeqCarga(BigDecimal seqCarga) {
        markAsChanged("SEQCARGA", seqCarga);
        this.seqCarga = seqCarga;
   }

   public String getSituacao() {
        return situacao;
   }

   public void setSituacao(String situacao) {
        markAsChanged("SITUACAO", situacao);
        this.situacao = situacao;
   }

   public String getObsMotorista() {
        return obsMotorista;
   }

   public void setObsMotorista(String obsMotorista) {
        markAsChanged("OBSMOTORISTA", obsMotorista);
        this.obsMotorista = obsMotorista;
   }

   public BigDecimal getOrdemCarga() {
        return ordemCarga;
   }

   public void setOrdemCarga(BigDecimal ordemCarga) {
        markAsChanged("ORDEMCARGA", ordemCarga);
        this.ordemCarga = ordemCarga;
   }

   public BigDecimal getOrdemCargaPai() {
        return ordemCargaPai;
   }

   public void setOrdemCargaPai(BigDecimal ordemCargaPai) {
        markAsChanged("ORDEMCARGAPAI", ordemCargaPai);
        this.ordemCargaPai = ordemCargaPai;
   }

   public BigDecimal getPesoMax() {
        return pesoMax;
   }

   public void setPesoMax(BigDecimal pesoMax) {
        markAsChanged("PESOMAX", pesoMax);
        this.pesoMax = pesoMax;
   }

   public BigDecimal getNuViag() {
        return nuViag;
   }

   public void setNuViag(BigDecimal nuViag) {
        markAsChanged("NUVIAG", nuViag);
        this.nuViag = nuViag;
   }

   public String getEnvioWms() {
        return envioWms;
   }

   public void setEnvioWms(String envioWms) {
        markAsChanged("ENVIOWMS", envioWms);
        this.envioWms = envioWms;
   }

   public BigDecimal getCodEmpPai() {
        return codEmpPai;
   }

   public void setCodEmpPai(BigDecimal codEmpPai) {
        markAsChanged("CODEMPPAI", codEmpPai);
        this.codEmpPai = codEmpPai;
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
        this.codDoca = vo.asBigDecimal("CODDOCA");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codLocal = vo.asBigDecimal("CODLOCAL");
        this.codParcDest = vo.asBigDecimal("CODPARCDEST");
        this.codParcMotorista = vo.asBigDecimal("CODPARCMOTORISTA");
        this.codParcOrig = vo.asBigDecimal("CODPARCORIG");
        this.codParcTransp = vo.asBigDecimal("CODPARCTRANSP");
        this.codReg = vo.asBigDecimal("CODREG");
        this.codRota = vo.asBigDecimal("CODROTA");
        this.codTipoPerTransb = vo.asBigDecimal("CODTIPOPERTRANSB");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.codUsuRetorno = vo.asBigDecimal("CODUSURETORNO");
        this.codVeiculo = vo.asBigDecimal("CODVEICULO");
        this.dhFinalPesagem = vo.asTimestamp("DHFINALPESAGEM");
        this.dhInicialPesagem = vo.asTimestamp("DHINICIALPESAGEM");
        this.dtAlter = vo.asTimestamp("DTALTER");
        this.dtAlterRotCat = vo.asTimestamp("DTALTERROTCAT");
        this.dtInic = vo.asTimestamp("DTINIC");
        this.dtPrevSaida = vo.asTimestamp("DTPREVSAIDA");
        this.dtRetorno = vo.asTimestamp("DTRETORNO");
        this.entSai = vo.asString("ENTSAI");
        this.freteCalc = vo.asString("FRETECALC");
        this.m3Max = vo.asBigDecimal("M3MAX");
        this.nroFrota = vo.asBigDecimal("NROFROTA");
        this.nuCaixa = vo.asBigDecimal("NUCAIXA");
        this.nuFinAcerto = vo.asBigDecimal("NUFINACERTO");
        this.prioridade = vo.asBigDecimal("PRIORIDADE");
        this.qtdEntrega = vo.asBigDecimal("QTDENTREGA");
        this.roteiro = vo.asString("ROTEIRO");
        this.tipDist = vo.asString("TIPDIST");
        this.tipEmbalagem = vo.asString("TIPEMBALAGEM");
        this.totalCarga = vo.asBigDecimal("TOTALCARGA");
        this.vincRot = vo.asString("VINCROT");
        this.vlrDifAcerto = vo.asBigDecimal("VLRDIFACERTO");
        this.vlrFrete = vo.asBigDecimal("VLRFRETE");
        this.horaSaida = vo.asTimestamp("HORASAIDA");
        this.idOrdemCarga = vo.asString("IDORDEMCARGA");
        this.justificativa = vo.asString("JUSTIFICATIVA");
        this.kmFin = vo.asBigDecimal("KMFIN");
        this.kmInic = vo.asBigDecimal("KMINIC");
        this.statusAval = vo.asString("STATUSAVAL");
        this.temTransbordo = vo.asString("TEMTRANSBORDO");
        this.tipCalcFrete = vo.asBigDecimal("TIPCALCFRETE");
        this.tipCarga = vo.asString("TIPCARGA");
        this.seqCarga = vo.asBigDecimal("SEQCARGA");
        this.situacao = vo.asString("SITUACAO");
        this.obsMotorista = vo.asString("OBSMOTORISTA");
        this.ordemCarga = vo.asBigDecimal("ORDEMCARGA");
        this.ordemCargaPai = vo.asBigDecimal("ORDEMCARGAPAI");
        this.pesoMax = vo.asBigDecimal("PESOMAX");
        this.nuViag = vo.asBigDecimal("NUVIAG");
        this.envioWms = vo.asString("ENVIOWMS");
        this.codEmpPai = vo.asBigDecimal("CODEMPPAI");
        return this;
   }
}
